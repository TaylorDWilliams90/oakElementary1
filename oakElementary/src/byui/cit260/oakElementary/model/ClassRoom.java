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
public class ClassRoom implements Serializable {
    
    private String title;
    private String description;
    private String gameItem;

    public ClassRoom() {
    }

    
    
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getGameItem() {
        return gameItem;
    }

    public void setGameItem(String gameItem) {
        this.gameItem = gameItem;
    }

    @Override
    public String toString() {
        return "ClassRoom{" + "title=" + title + ", desciption=" + description + ", gameItem=" + gameItem + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + Objects.hashCode(this.title);
        hash = 37 * hash + Objects.hashCode(this.description);
        hash = 37 * hash + Objects.hashCode(this.gameItem);
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
        final ClassRoom other = (ClassRoom) obj;
        if (!Objects.equals(this.title, other.title)) {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        if (!Objects.equals(this.gameItem, other.gameItem)) {
            return false;
        }
        return true;
    }
    
    
    
    
}
