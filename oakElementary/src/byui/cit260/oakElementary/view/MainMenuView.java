/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.oakElementary.view;

/**
 *
 * @author Kory
 */
public class MainMenuView extends View {
    
    public MainMenuView() {
        super("\n"
                + "\n---------------------------------------"
                + "\n| Main Menu"
                + "\n---------------------------------------"
                + "\nN - Start new game"
                + "\nG - Get and start saved game"
                + "\nH - Get help on how to play the game"
                + "\nS - Save game"
                + "\nQ - Quit"
                + "\n---------------------------------------");
        
    }
    public void doAction(char choice) {
        case 'N':
            this.startNewGame();
            break;
        case 'G':
            this.startExistingGame();
            break;
        case 'H':
            this.displayHelpMenu();
            break;
        case 'S':
            this.saveGame();
            break;
        case 'E':
            return;
        default:
            System.out.println("\n*** Invaild selection *** Try again");
    }
}
    

