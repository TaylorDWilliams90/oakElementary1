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
public class Cafeteria implements Serializable {
    // class instance variables
    private String Drink;
    private String Pie;
    private String MakeRoom;

    public Cafeteria() {
    }
    
    

    public String getDrink() {
        return Drink;
    }

    public void setDrink(String Drink) {
        this.Drink = Drink;
    }

    public String getPie() {
        return Pie;
    }

    public void setPie(String Pie) {
        this.Pie = Pie;
    }

    public String getMakeRoom() {
        return MakeRoom;
    }

    public void setMakeRoom(String MakeRoom) {
        this.MakeRoom = MakeRoom;
    }

    @Override
    public String toString() {
        return "Cafeteria{" + "Drink=" + Drink + ", Pie=" + Pie + ", MakeRoom=" + MakeRoom + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.Drink);
        hash = 97 * hash + Objects.hashCode(this.Pie);
        hash = 97 * hash + Objects.hashCode(this.MakeRoom);
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
        final Cafeteria other = (Cafeteria) obj;
        if (!Objects.equals(this.Drink, other.Drink)) {
            return false;
        }
        if (!Objects.equals(this.Pie, other.Pie)) {
            return false;
        }
        if (!Objects.equals(this.MakeRoom, other.MakeRoom)) {
            return false;
        }
        return true;
    }
    
    
}
