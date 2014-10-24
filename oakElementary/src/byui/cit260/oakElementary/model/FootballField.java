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
public class FootballField implements Serializable{
    
    private String OffensePlays;
    private String DefensePlays;

    public FootballField() {
    }    
    
    public String getOffensePlays() {
        return OffensePlays;
    }

    public void setOffensePlays(String OffensePlays) {
        this.OffensePlays = OffensePlays;
    }

    public String getDefensePlays() {
        return DefensePlays;
    }

    public void setDefensePlays(String DefensePlays) {
        this.DefensePlays = DefensePlays;
    }

    @Override
    public String toString() {
        return "FootballField{" + "OffensePlays=" + OffensePlays + ", DefensePlays=" + DefensePlays + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + Objects.hashCode(this.OffensePlays);
        hash = 31 * hash + Objects.hashCode(this.DefensePlays);
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
        final FootballField other = (FootballField) obj;
        if (!Objects.equals(this.OffensePlays, other.OffensePlays)) {
            return false;
        }
        if (!Objects.equals(this.DefensePlays, other.DefensePlays)) {
            return false;
        }
        return true;
    }
    
        
    
}
