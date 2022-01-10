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

public class Stack {

    private ArrayList<String> values;

    public Stack() {
        this.values = new ArrayList<>();
    }
    
    public boolean isEmpty() {
        if(this.values.isEmpty()) {
            return true;
        }
        return false;
    }
    
    public void add(String value) {
        this.values.add(value);
    }
    
    public ArrayList<String> values() {
        return this.values;
    }
    
    public String take() {
        String temp = this.values.get(this.values.size() - 1);
        this.values.remove(this.values.size() - 1);
        return temp;
    }

}
