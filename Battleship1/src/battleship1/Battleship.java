/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package battleship1;

import java.util.Scanner;

/**
 *
 * @author J.Pratt
 */
public class Battleship {
    
    
    String name;
    String instructions = "This is the game of Battleship \n\n"
            + "Two players duke it out in an epic war game involving \n"
            + "battleships and a grid.  Both players take turns trying to \n"
            + "guess the locations of the other player's ships.  The first \n"
            + "player to find all their opponents ships wins the game. \n\n"
            + "Anchors away!!! \n\n";
    
    public static void main(String[] args) {
        Battleship myGame = new Battleship();
        
        myGame.getName();
        myGame.displayHelp();
        
        Board board = new Board();
        board.displaySize();
        
        Game game = new Game();
        game.displayPlayers();
        
        Location location = new Location();
        location.displayMarker();
        int i = location.moveShips();
        while (i == -1){
            i = location.moveShips();
        }
                
        Ships ships = new Ships();
        ships.displayShips();
        
        MainMenuView mainMenu = new MainMenuView();
        mainMenu.getInput();
        
        GamePreferencesMenuView gamePreferencesMenu = new GamePreferencesMenuView();
        mainMenu.getInput();
        
    }
    public void getName() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name: ");
        this.name = input.next();
    }
    
    public void displayHelp() {
        System.out.println("\nWelcome " + this.name + "\n");
        System.out.println(this.instructions);
    }
}
