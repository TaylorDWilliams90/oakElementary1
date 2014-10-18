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
public class Map implements Serializable {
    
    private String description;
    private double difficulty;
    private double rows;
    private double columns;

    public Map() {
    }
    

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(double difficulty) {
        this.difficulty = difficulty;
    }

    public double getRows() {
        return rows;
    }

    public void setRows(double rows) {
        this.rows = rows;
    }

    public double getColumns() {
        return columns;
    }

    public void setColumns(double columns) {
        this.columns = columns;
    }

    @Override
    public String toString() {
        return "Map{" + "description=" + description + ", difficulty=" + difficulty + ", rows=" + rows + ", columns=" + columns + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 89 * hash + Objects.hashCode(this.description);
        hash = 89 * hash + (int) (Double.doubleToLongBits(this.difficulty) ^ (Double.doubleToLongBits(this.difficulty) >>> 32));
        hash = 89 * hash + (int) (Double.doubleToLongBits(this.rows) ^ (Double.doubleToLongBits(this.rows) >>> 32));
        hash = 89 * hash + (int) (Double.doubleToLongBits(this.columns) ^ (Double.doubleToLongBits(this.columns) >>> 32));
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
        final Map other = (Map) obj;
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        if (Double.doubleToLongBits(this.difficulty) != Double.doubleToLongBits(other.difficulty)) {
            return false;
        }
        if (Double.doubleToLongBits(this.rows) != Double.doubleToLongBits(other.rows)) {
            return false;
        }
        if (Double.doubleToLongBits(this.columns) != Double.doubleToLongBits(other.columns)) {
            return false;
        }
        return true;
    }
    
    
    
    
    
    
}
