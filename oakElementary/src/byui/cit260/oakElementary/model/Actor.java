/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.oakElementary.model;

import java.awt.Point;
import java.io.Serializable;


/**
 *
 * @author Kory
 */
public enum Actor implements Serializable {
    PrincipalBills("He is over Oak Elementray and will be in the class room at all times"),
    TeacherJackson("He is watching over all of the kids in the game"),
    TheNerd("He is in the playground asking the questions"),
    TheJock("He is the one on the football faild at all times"),
    Todd("He is always playing chance games like heads or tails"),
    Ceasar("He is always on the monkey bars.");

    private final String description;
    private final Point coordinates;

    Actor(String description) {
        this.description = description;
        coordinates = new Point(1,1);
    }

    public String getDescription() {
        return description;
    }
    public Point getcoordinates() {
        return coordinates;
    }
}
