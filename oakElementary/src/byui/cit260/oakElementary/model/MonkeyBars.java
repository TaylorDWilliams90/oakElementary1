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
 * @author Kory
 */
public class MonkeyBars implements Serializable {
    
    private String title;
    private String description;
    private double numbers;

    public MonkeyBars() {
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getNumbers() {
        return numbers;
    }

    public void setNumbers(double numbers) {
        this.numbers = numbers;
    }

    @Override
    public String toString() {
        return "MonkeyBars{" + "title=" + title + ", description=" + description + ", numbers=" + numbers + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 79 * hash + Objects.hashCode(this.title);
        hash = 79 * hash + Objects.hashCode(this.description);
        hash = 79 * hash + (int) (Double.doubleToLongBits(this.numbers) ^ (Double.doubleToLongBits(this.numbers) >>> 32));
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
        final MonkeyBars other = (MonkeyBars) obj;
        if (!Objects.equals(this.title, other.title)) {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        if (Double.doubleToLongBits(this.numbers) != Double.doubleToLongBits(other.numbers)) {
            return false;
        }
        return true;
    }
    
    

    
    
    
    
 
    
    
}
