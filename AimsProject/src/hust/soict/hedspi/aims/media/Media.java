// 

package hust.soict.hedspi.aims.media;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public abstract class Media {
    private int id;
    private String title, category;
    private float cost;

    public Media() {
    }

    public Media(int id, String title, String category, float cost) {
        this.id = id;
        this.title = title;
        this.category = category;
        this.cost = cost;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getCategory() {
        return category;
    }

    public float getCost() {
        return cost;
    }
    
    @Override
    public String toString(){
        return title + " - " + category;
    }
    
    // Unique item
    @Override
    public boolean equals(Object o){
        if (o instanceof Media)
            return this.title.equals(((Media)o).getTitle());
        else return false;
    }
}
