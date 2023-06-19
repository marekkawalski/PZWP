package org.example;

public final class LiczydloSingleton {
    private static volatile LiczydloSingleton liczydloSingleton;
    private LiczydloSingleton() {}
    public void obliczenia1() {
        System.out.println("Wykonuj� obliczenia nr 1");
    }
    public void obliczenia2() {
        System.out.println("Wyjkonuj� obliczenia nr 2");
    }

    public static LiczydloSingleton getInstance(){
       final LiczydloSingleton result = liczydloSingleton;
        if (result != null) {
            return result;
        }
        synchronized(LiczydloSingleton.class) {
            if (liczydloSingleton == null) {
                liczydloSingleton = new LiczydloSingleton();
            }
            return liczydloSingleton;
        }
    }
}
