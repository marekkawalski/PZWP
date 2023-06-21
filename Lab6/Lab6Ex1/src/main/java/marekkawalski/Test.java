package marekkawalski;

public class Test {
    public static void main(String[] args) {
        LionContext lion = new LionContext();
        System.out.println("==Zaczepiam lwa");
        lion.poke();
        System.out.println("==Karmie lwa");
        lion.feed();
        System.out.println("==Zaczepiam lwa");
        lion.poke();
        System.out.println("==Spiewam lwu");
        lion.sing();
        System.out.println("==Odbieram lwu jedzenie");
        lion.takeFood();
        System.out.println("==Spiewam lwu");
        lion.sing();
        System.out.println("==Odbieram lwu jedzenie");
        lion.takeFood();
    }
}
