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

public class Suitcase {

    private ArrayList<Item> items;
    private int weight;
    private int maxWeight;

    public Suitcase(int maxWeight) {
        this.weight = 0;
        this.items = new ArrayList<>();
        this.maxWeight = maxWeight;
    }

    public void addItem(Item item) {
        if ((this.weight + item.getWeight()) > this.maxWeight) {
            return;
        }
        this.items.add(item);
        this.weight += item.getWeight();
    }

    public int getWeight() {
        return this.weight;
    }
    
    public int totalWeight() {
        return this.weight;
    }
    
    public Item heaviestItem() {
        if(this.items.isEmpty()) {
            return null;
        }
        if(this.items.size() == 1) {
            return this.items.get(0);
        }
        Item heaviest = this.items.get(0);
        
        for (int i = 0; i < this.items.size(); i++) {
            if(heaviest.getWeight() < this.items.get(i).getWeight()) {
                heaviest = this.items.get(i);
            }
        }
        return heaviest;
    }

    public void printItems() {
        if(this.items.isEmpty()) {
            return;
        }
        if(this.items.size() == 1) {
            System.out.println(this.items.get(0));
            return;
        }
        
        System.out.println("The suitcase contains the following items:");
        for (Item item : this.items) {
            System.out.println(item);
        }
    }

    @Override
    public String toString() {
        if (this.items.size() == 0) {
            return "no items (" + getWeight() + " kg)";
        }
        if (this.items.size() == 1) {
            return this.items.size() + " item (" + getWeight() + " kg)";
        }
        return this.items.size() + " items (" + getWeight() + " kg)";
    }
}
