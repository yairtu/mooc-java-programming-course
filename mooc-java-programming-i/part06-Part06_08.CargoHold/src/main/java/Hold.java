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

public class Hold {

    private int maxWeight;
    private ArrayList<Suitcase> suitcases;
    private int totalWeight;

    public Hold(int maxWeight) {
        this.maxWeight = maxWeight;
        this.suitcases = new ArrayList<>();
        this.totalWeight = 0;
    }

    public int getTotalWeight() {
        return this.totalWeight;
    }

    public void addSuitcase(Suitcase suitcase) {
        if ((this.totalWeight + suitcase.totalWeight()) > this.maxWeight) {
            return;
        }
        this.suitcases.add(suitcase);
        this.totalWeight += suitcase.getWeight();
    }

    public void printItems() {
        int i = 0;
        while (i < this.suitcases.size()) {
            this.suitcases.get(i).printItems();
            i++;
        }
    }

    public String toString() {
        return this.suitcases.size() + " suitcases (" + this.totalWeight + " kg)";
    }

}
