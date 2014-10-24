/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package byui.cit260.oakElementary.model;

import java.io.Serializable;

/**
 *
 * @author Admin
 */
public class Locations implements Serializable{
    private double rows;
    private double columns;

    public Locations() {
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
        return "Locations{" + "rows=" + rows + ", columns=" + columns + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 13 * hash + (int) (Double.doubleToLongBits(this.rows) ^ (Double.doubleToLongBits(this.rows) >>> 32));
        hash = 13 * hash + (int) (Double.doubleToLongBits(this.columns) ^ (Double.doubleToLongBits(this.columns) >>> 32));
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
        final Locations other = (Locations) obj;
        if (Double.doubleToLongBits(this.rows) != Double.doubleToLongBits(other.rows)) {
            return false;
        }
        if (Double.doubleToLongBits(this.columns) != Double.doubleToLongBits(other.columns)) {
            return false;
        }
        return true;
    }
    
    
}
