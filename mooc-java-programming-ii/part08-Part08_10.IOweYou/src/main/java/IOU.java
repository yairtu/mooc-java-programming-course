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

public class IOU {
    
    private HashMap<String, Double> owed;
    
    public IOU() {
        this.owed = new HashMap<>();
    }
    
    public void setSum(String toWhome, double amount) {
        this.owed.put(toWhome, amount);
    }
    
    public double howMuchDoIOweTo(String whom) {
        return this.owed.getOrDefault(whom, 0.0);
        
    }
    
}
