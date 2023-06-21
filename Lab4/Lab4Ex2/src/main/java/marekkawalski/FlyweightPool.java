package marekkawalski;

import java.util.HashMap;
import java.util.Map;

public class FlyweightPool {
    private final Map<String, Item> itemPool = new HashMap<>();

    public Item getArticle(String name, double price) {
        String key = name + "_" + price;
        if (itemPool.containsKey(key)) {
            return itemPool.get(key);
        }
        Item newItem = new Item(name, price);
        itemPool.put(key, newItem);
        return newItem;
    }
}
