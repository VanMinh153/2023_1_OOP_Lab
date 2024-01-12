// 

package hust.soict.hedspi.aims.media;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class DVD extends Disc implements Playable {

    public DVD(int id, String title, String category, String director, int length, float cost) {
        super(id, title, category, director, length, cost);
    }
    
    @Override
    public void play() {
        System.out.println("Playing DVD: " + this.getTitle());
        System.out.println("DVD length: " + this.getLength());
    }
    
    @Override
    public String toString(){
        return "DVD - " + super.toString();
    }
}
/*

*/
