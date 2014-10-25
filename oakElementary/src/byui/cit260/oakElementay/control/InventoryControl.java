/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.oakElementay.control;

/**
 *
 * @author Kory
 */
public class InventoryControl {
    
    public double calcCoinsNeeded(double coins, double cost) {
        
        
        if (coins < 5) { // Invalid because not a positive amount of coins
                return -1;
        }            
        
        double remainderCoins = coins - cost;
                
        return remainderCoins;
    }
    
}
