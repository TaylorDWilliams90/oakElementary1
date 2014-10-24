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
public class HeadsOrTails implements Serializable{
    
    // class instance variables
    private String Outcome;

    public HeadsOrTails() {
    }

    public String getOutcome() {
        return Outcome;
    }

    public void setOutcome(String Outcome) {
        this.Outcome = Outcome;
    }

    @Override
    public String toString() {
        return "HeadsOrTails{" + "Outcome=" + Outcome + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + Objects.hashCode(this.Outcome);
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
        final HeadsOrTails other = (HeadsOrTails) obj;
        if (!Objects.equals(this.Outcome, other.Outcome)) {
            return false;
        }
        return true;
    }
    
    
    
}
