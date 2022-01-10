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
import java.util.ArrayList;

public class VehicleRegistry {
    
    private HashMap<LicensePlate, String> registry = new HashMap<>();
    
    public boolean add(LicensePlate licensePlate, String owner) {
        if (registry.get(licensePlate) == null) {
            registry.put(licensePlate, owner);
            return true;
        }
        return false;
    }
    
    public String get(LicensePlate licensePlate) {
        return registry.get(licensePlate);
    }
    
    public boolean remove(LicensePlate licensePlate) {
        if (registry.get(licensePlate) == null) {
            return false;
        }
        registry.remove(licensePlate);
        return true;
    }
    
    public void printLicensePlates() {
        for (LicensePlate licensePlate : registry.keySet()) {
            System.out.println(licensePlate);
        }
    }
    
    public void printOwners() {
        ArrayList<String> ownerList = new ArrayList<>();
        
        for (String owner : registry.values()) {
            if (ownerList.contains(owner)) {
                continue;
            }
            System.out.println(owner);
            ownerList.add(owner);
        }
    }
    
}
