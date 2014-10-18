/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package oakelementary;

// Imports all the Class files we need
import byui.cit260.oakElementary.model.*;
import java.util.HashSet;
import java.util.Set;


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
        playerOne.setBestScore(9.50);
        
        String playerInfo = playerOne.toString();
        System.out.println(playerInfo);
        
        // Actor 
        
        Actor actorOne = new Actor();
        
        actorOne.setName("Mr. Principal");
        actorOne.setDescription("Mr. Principal is old, fat, mean, and doesn't "
                + "like it when students ask him questions.");
        
        String actorInfo = actorOne.toString();
        System.out.println(actorInfo);
        
        // Monkey Bars 
        
        MonkeyBars monkey = new MonkeyBars();
        
        monkey.setTitle("Monkey Bars");
        monkey.setDescription("These Monkey bars have always been ruled by the big "
                + "6th graders. You can only cross if you have the right answer.");
        monkey.setNumbers(12);
        
        String monkeyInfo = monkey.toString();
        System.out.println(monkeyInfo);
        
        // Playground 
        
        Playground playgroundOne = new Playground();
        
        playgroundOne.setTitle("Playground");
        playgroundOne.setDescription("This is the best playground you have ever seen.");
        playgroundOne.setQuestion("Can you answer this Question?");
        playgroundOne.setAnswer("Yes.");
        
        String playgroundOneInfo = playgroundOne.toString();
        System.out.println(playgroundOneInfo);
        
        // Classroom
        
        ClassRoom homeRoom = new ClassRoom();
        
        homeRoom.setTitle("Class Room");
        homeRoom.setDescription("Third period, History Class");
        homeRoom.setGameItem("Pencil");
        
        String homeRoomInfo = homeRoom.toString();
        System.out.println(homeRoomInfo);
        
        
        // Map
        
        Map map = new Map();
        
        map.setDescription("Oak Elementary has several locations to explore.");
        map.setDifficulty(5);
        map.setRows(3);
        map.setColumns(2);
        
        String mapInfo = map.toString();
        System.out.println(mapInfo);
        
        
             
    }
    
}
