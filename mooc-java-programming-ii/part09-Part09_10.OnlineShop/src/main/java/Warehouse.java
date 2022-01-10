/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yairt
 */
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Warehouse {

    private Map<String, Integer> warehouseItemsPrice;
    private Map<String, Integer> stockMap;

    public Warehouse() {
        this.warehouseItemsPrice = new HashMap<>();
        this.stockMap = new HashMap<>();
    }

    public void addProduct(String product, int price, int stock) {
        this.warehouseItemsPrice.put(product, price);
        this.stockMap.put(product, stock);
    }

    public int price(String product) {
        if (this.warehouseItemsPrice.keySet().contains(product)) {
            return this.warehouseItemsPrice.get(product);
        } else {
            return -99;
        }
    }

    public int stock(String product) {
        if (this.stockMap.keySet().contains(product)) {
            return this.stockMap.get(product);
        } else {
            return 0;
        }
    }

    public boolean take(String product) {
        if (!this.stockMap.keySet().contains(product)) {
            return false;
        }

        if (this.stockMap.get(product) > 0) {
            this.stockMap.put(product, (this.stockMap.get(product) - 1));
            return true;
        }
        return false;
    }

    public Set<String> products() {
        Set<String> p = this.stockMap.keySet();

        return p;
    }

}
