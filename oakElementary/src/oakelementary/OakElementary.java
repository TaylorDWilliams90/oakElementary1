/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package oakelementary;

import byui.cit260.oakElementary.model.Player;

/**
 *
 * @author Admin
 */
public class OakElementary {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Player playerOne = new Player();
        
        playerOne.setName("Taylor Williams");
        playerOne.setBestTime(9.50);
        
        String playerInfo = playerOne.toString();
        System.out.println(playerInfo);
        
    }
    
}
