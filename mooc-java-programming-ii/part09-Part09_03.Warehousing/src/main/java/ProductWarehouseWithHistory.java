/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yairt
 */
public class ProductWarehouseWithHistory extends ProductWarehouse {

    private ChangeHistory changeHistory;

    public ProductWarehouseWithHistory(String productName, double capacity, double initialBalance) {
        super(productName, capacity);
        this.changeHistory = new ChangeHistory();

        super.addToWarehouse(initialBalance);

        changeHistory.add(initialBalance);
    }

    public String history() {
        return changeHistory.toString();
    }
    
    public void printAnalysis() {
        System.out.println("Product: " + this.getName());
        System.out.println("History: " + this.changeHistory.toString());
        System.out.println("Largest amount of product: " + this.changeHistory.maxValue());
        System.out.println("Smallest amount of product: " + this.changeHistory.minValue());
        System.out.println("Average: " + this.changeHistory.average());
    }
    
    @Override
    public void addToWarehouse(double amount) {
        double result = 0;

        result = (double) super.getBalance() + amount;

        this.changeHistory.add(result);
        //histroy to be added

        super.addToWarehouse(amount);

    }

    @Override
    public double takeFromWarehouse(double amount) {
        double result = 0;

        result = (double) super.getBalance() - amount;

        //the difference is added not just the amount
        this.changeHistory.add(result);

        return super.takeFromWarehouse(amount);

    }

}
