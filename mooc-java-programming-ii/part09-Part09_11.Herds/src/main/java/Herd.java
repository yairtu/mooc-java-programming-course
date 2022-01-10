
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yairt
 */
public class Herd implements Movable {

    private List<Movable> herd = new ArrayList<>();
    
    public void addToHerd(Movable movable) {
        this.herd.add(movable);
    }
    
    
    @Override
    public void move(int dx, int dy) {
        for (Movable o : this.herd) {
            o.move(dx, dy);
        }
    }

    @Override
    public String toString() {
        String string = "";
        
        for (Movable o : this.herd) {
            string += o.toString() + "\n";
        }
        return string;
    }
    
    
}
