/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package byui.cit260.oakElementary.view;

import byui.cit260.oakElementary.model.Player;
import byui.cit260.oakElementay.control.ProgramControl;
import java.lang;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class StartProgramView {
    
    public StartProgramView() {
    }
    
    public void startProgram() {
        // Display the banner screen
        this.displayBanner();
        // promt the player to enter their name Retriere the name of the player
        String playersName = this.getPlayersName();
        
        // create and save the plare object
        Player player = ProgramControl.createPlayer(playersName);
        
        // Display a personalized welcome
        this.displayWelcomeMessage(player);
        // Display the Main menu.
        
        MainMenuView mainMenuView = new MainMenuView();
        mainMenuView.display();
    }

    private void displayBanner() {
        System.out.println(
                   "\n\n*****************************************************************");
        
        System.out.println(
                   "\n* You are a 5th-grader at Oak Elementary, a school with its own    *"
                +  "\n* socioeconomic structure where kids bet, trade, and barter using  *"
                +  "\n* marbles as a currency. You are being bullied by Brody the Bully, *"
                +  "\n* a second-year 5th grader who lives to make your life a living    *"
                +  "\n* hell.                                                            *");
        
        System.out.println("*                                                               *"
                + "\n* But today is different, the toughest, dumbest kid in 6th grade    *"
                + "\n* - Brock - has offered you his protection from the ruthless Brody. *"
                + "\n* But, he requires a large marble payment. Thus the game begins.    *");
        
        System.out.println("*                                                               *"
                + "\n* You must make your way around the schoolyard and earn             *"
                + "\n* enough to pay Brock by challenging and/or helping other           *"
                + "\n* students for marbles. Different characters will be located        *"
                + "\n* around the school grounds, each represented by a different        *"
                + "\n* point on your map. When visited, each of these characters will    *"
                + "\n* present your character with a challenge, or problem to solve,     *"
                + "\n* and each will provide a wager or payment in connection with it.   *"
                + "\n* After completing different challenges, you will be given the      *"
                + "\n* opportunity to return to the school map and move on to another    *"
                + "\n* challenge. *");
        
        System.out.println("*                                                              *"
                + "\n* Once you’ve collected enough marbles, you can visit Brock on      *"
                + "\n* the map and provide him with his payment. Once you                *"
                + "\n* accomplish this, you will have beat the game, and your            *"
                + "\n* character can now enjoy a new bully-free status!                  *");
        
        System.out.println("*****************************************************************");
    }

    private String getPlayersName() {
        boolean valid = false;
        String playersName = null; 
        Scanner keyboard = new Scanner(System.in);
        
        while(!valid) {
            
            System.out.println("Enter the player's name below:");
            
            
            if (playersName.length() < 1) {
                System.out.println("Invalid name - the name must not be blank");
                continue;
        }
            break;
        }
        return playersName;
    }

    private void displayWelcomeMessage(Player player) {
        System.out.println("\n\n=============================================");
        System.out.println("\tWelcome to the game " + player.getName());
        System.out.println("\tWe hope you have a lot of fun!");
        System.out.println("================================================");
    }
}
