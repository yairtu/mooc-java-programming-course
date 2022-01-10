
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author yairt
 */
public class Box implements Packable {

    private ArrayList<Packable> items;
    private double maxWeight;

    public Box(double maxWeight) {
        this.items = new ArrayList<>();
        this.maxWeight = maxWeight;
    }

    public void add(Packable item) {
        if (this.weight() + item.weight() <= this.maxWeight) {
            this.items.add(item);
        }
    }

    @Override
    public double weight() {
        double total = 0;

        total = items.stream().map(i -> i.weight()).reduce(total, (accumulator, _item) -> accumulator + _item);

        return total;
    }

    @Override
    public String toString() {
        return "Box: " + this.items.size() + " items, total weight " + this.weight() + " kg";
    }
}
