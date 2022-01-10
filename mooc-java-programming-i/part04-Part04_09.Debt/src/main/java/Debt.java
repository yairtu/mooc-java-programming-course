/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yairt
 */
public class Debt {
    
    private double balance;
    private double interestRate;
    
    public Debt(double initialBalance, double InitialInterestRate) {
        this.balance = initialBalance;
        this.interestRate = InitialInterestRate;
    }
    
    public void printBalance() {
         System.out.println(this.balance);
    }
    
    public void waitOneYear() {
        this.balance = this.balance * this.interestRate;
    }
    
}
