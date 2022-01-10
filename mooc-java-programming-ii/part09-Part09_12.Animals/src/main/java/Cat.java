/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yairt
 */
public class Cat extends Animal implements NoiseCapable {
    
    public Cat() {
        this("Cat");
    }
    
    public Cat(String anmialName) {
        super(anmialName);
    }
    
    public void purr() {
        System.out.println(getName() + " purrs");
    }

    @Override
    public void makeNoise() {
        purr();
    }
    
}
