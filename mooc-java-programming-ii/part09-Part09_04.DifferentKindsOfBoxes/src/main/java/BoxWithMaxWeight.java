/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yairt
 */
import java.util.ArrayList;

public class BoxWithMaxWeight extends Box {

    private int capacity;
    private ArrayList<Item> itemsInMaxBox;

    public BoxWithMaxWeight(int capacity) {
        this.capacity = capacity;
        this.itemsInMaxBox = new ArrayList<>();
    }

    public int getCapacity() {
        return this.capacity;
    }

    public int getCurrentAmount() {
        int sum = 0;
        for (Item i : this.itemsInMaxBox) {
            sum += i.getWeight();
        }
        return sum;
    }

    @Override
    public void add(Item item) {
        if (item.getWeight() + getCurrentAmount() <= this.capacity) {
            itemsInMaxBox.add(item);
        }
    }

    @Override
    public boolean isInBox(Item item) {
        return itemsInMaxBox.contains(item);
    }

}
