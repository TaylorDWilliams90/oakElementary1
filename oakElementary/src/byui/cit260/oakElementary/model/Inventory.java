/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package byui.cit260.oakElementary.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Admin
 */
public class Inventory implements Serializable{
    private String ItemName;
    private String ItemDescription;

    public Inventory() {
    }
    
    public String getItemName() {
        return ItemName;
    }

    public void setItemName(String ItemName) {
        this.ItemName = ItemName;
    }

    public String getItemDescription() {
        return ItemDescription;
    }

    public void setItemDescription(String ItemDescription) {
        this.ItemDescription = ItemDescription;
    }

    @Override
    public String toString() {
        return "Inventory{" + "ItemName=" + ItemName + ", ItemDescription=" + ItemDescription + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 89 * hash + Objects.hashCode(this.ItemName);
        hash = 89 * hash + Objects.hashCode(this.ItemDescription);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Inventory other = (Inventory) obj;
        if (!Objects.equals(this.ItemName, other.ItemName)) {
            return false;
        }
        if (!Objects.equals(this.ItemDescription, other.ItemDescription)) {
            return false;
        }
        return true;
    }
    
    
    
}
