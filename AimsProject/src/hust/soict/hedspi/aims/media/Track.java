// 

package hust.soict.hedspi.aims.media;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Track implements Playable{
    private String title;
    private int length;

    public Track() {
    }

    public Track(String title, int length) {
        this.title = title;
        this.length = length;
    }

    public String getTitle() {
        return title;
    }

    public int getLength() {
        return length;
    }

    @Override
    public void play() {
        System.out.println("Playing Track: " + this.getTitle() + "Track length: " + this.getLength());
    }
    // Unique item
    @Override
    public boolean equals(Object o){
        return this.title.equals(((Track)o).getTitle()) && this.length == ((Track)o).getLength();
    }
    
}
/*

*/
