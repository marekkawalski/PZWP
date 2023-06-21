package marekkawalski;

public class Test {

    public static void main(String[] args) {
        FlyweightPool flyweightPool = new FlyweightPool();

        Warehouse[] warehouses = new Warehouse[100];
        for (int i = 0; i < warehouses.length; i++) {
            warehouses[i] = new Warehouse();
            for (int j = 0; j < 20; j++) {
                warehouses[i].addItem(flyweightPool.getArticle("art" + j, j));
            }
        }

        for (Warehouse m : warehouses) {
            for (Item a : m.getItems()) {
                System.out.println(a.getName() + " " + a.getPrice());
            }
        }

        Runtime.getRuntime().gc();
        long memoryUsed = Runtime.getRuntime().totalMemory()-Runtime.getRuntime().freeMemory();
        System.out.println("memory used " + memoryUsed +" bytes");
    }
}
