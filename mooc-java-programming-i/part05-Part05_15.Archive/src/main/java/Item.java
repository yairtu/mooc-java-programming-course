/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yairt
 */
import java.util.Objects;

public class Item {

    private String id;
    private String name;

    public Item(String id, String name) {
        this.name = name;
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        
        if (obj == null) {
            return false;
        }

        if (!(obj instanceof Item)) {
            return false;
        }

        Item compared = (Item) obj;

        if (!Objects.equals(this.id, compared.id)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return this.id + ": " + this.name;
    }

}
