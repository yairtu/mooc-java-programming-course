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

public class ChangeHistory {

    private ArrayList<Double> history;

    public ChangeHistory() {
        this.history = new ArrayList<>();
    }

    public void add(double status) {
        this.history.add(status);
    }

    public void clear() {
        this.history.clear();
    }

    public double maxValue() {
        if (this.history.isEmpty()) {
            return 0.0;
        }

        double maxValue = Double.MIN_VALUE;
        int i = 0;
        while (i < this.history.size()) {
            if (maxValue < this.history.get(i)) {
                maxValue = this.history.get(i);
            }
            i++;
        }
        return maxValue;
    }

    public double minValue() {
        if (this.history.isEmpty()) {
            return 0.0;
        }

        double minValue = Double.MAX_VALUE;
        int i = 0;
        while (i < this.history.size()) {
            if (minValue > this.history.get(i)) {
                minValue = this.history.get(i);
            }
            i++;
        }
        return minValue;
    }

    public double average() {
        if (this.history.isEmpty()) {
            return 0.0;
        }
        int i = 0;
        int sum = 0;
        while (i < this.history.size()) {
            sum += this.history.get(i);
            i++;
        }
        return (double) sum / i;
    }

    public String toString() {
        return history.toString();
    }

}
