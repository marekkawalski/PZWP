package org.example;

public class Test {
	public static void main(String[] args) {
		Liczydlo o1 = new Liczydlo();
		o1.obliczenia1();
		o1.obliczenia2();
		
//		LiczydloSingleton o2 = LiczydloSingleton.getInstance();
//		o2.obliczenia1();
//		o2.obliczenia2();
//
//		
//		for(int i=1;i<=5;i++) {
//			System.out.println("Attempt: "+i);
//			LiczydloPool o3 = LiczydloPool.getInstance();
//			if(o3!=null) {
//				o3.obliczenia1();
//				o3.obliczenia2();
//				o3.free();
//			}
//			else {
//				System.out.println("No free objects!");
//			}
//		}
		
	}
}
