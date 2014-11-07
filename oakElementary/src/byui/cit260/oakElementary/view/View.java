/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.oakElementary.view;

import java.lang;
import java.util.Scanner;

/**
 *
 * @author Kory
 */
public abstract class View  implements ViewInterface{
    
    private String promptMessage;
    
    public View(String promptMessage) {
        this.promptMessage = promptMessage;
    }

    @Override
    public void display() {
        String value;
        
        do {
             System.out.println(this.promptMessage);
             value = this.getInput();
             this.doAction(value);
    
        } while (!value.equals("Q"));
    }    
        
 

//    @Override
//    public String getInput() {
//        
//        Scanner keyboard = new Scanner(System.in);
//        boolean valid = false;
//        String selction = null;
//        
//        while (!valid) {
//            
//            System.out.println("\t\nEnter your selection below:");
//            
//            selection = keyboard.nextLine();
//            selction = selection.trim();
//            
//            if (selection.length() < 1) {
//                System.out.println("\n*** Invalid selection *** Try again");
//                continue;
//            }
//            break;
//        }
//        
//        return selection;
//    }

    

    
    
    
   
    
}
