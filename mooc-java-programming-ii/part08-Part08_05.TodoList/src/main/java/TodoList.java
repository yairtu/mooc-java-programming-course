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

public class TodoList {
    
    private ArrayList<String> todoList;
    
    public TodoList() {
        this.todoList = new ArrayList<>();
    }
    
    public void add(String task) {
        this.todoList.add(task);
    }
    
    public void print() {
        int i = 0;
        while(i < this.todoList.size()) {
            System.out.println((i+1) + ": " + this.todoList.get(i));
            i++;
        }
    }
    
    public void remove(int number) {
        this.todoList.remove(number - 1);
    }
    
}
