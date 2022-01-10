
import java.util.HashMap;
import java.util.Map;

public class ShoppingCart {

    private Map<String, Item> itemsPrice = new HashMap<>();

    public void add(String product, int price) {
        this.itemsPrice.putIfAbsent(product, new Item(product, 0, price));
        this.itemsPrice.get(product).increaseQuantity();
    }

    public int price() {
        int sum = 0;
        for (Item item : this.itemsPrice.values()) {
            sum += item.price();
        }
        return sum;
    }

    public void print() {
        for (Item item : itemsPrice.values()) {
            System.out.println(item);
        }        
    }

}
