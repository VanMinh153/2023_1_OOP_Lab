// 

package hust.soict.hedspi.aims.media;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class CD extends Disc implements Playable {
    private String artist;
    private ArrayList<Track> tracks = new ArrayList<>();

    public String getArtist() {
        return artist;
    }

    public CD() {
    }

    public CD(int id, String title, String category, String director, int length, float cost, String artist) {
        super(id, title, category, director, length, cost);
        this.artist = artist;
    }
    
    public void addTrack(Track track){
        if(tracks.contains(track)) System.out.println("The " + track.getTitle() + " is already in this CD");
        else tracks.add(track);
    }
    
    public void removeTrack(Track track){
        if(!tracks.contains(track)) System.out.println("The " + track.getTitle() + " is not in this CD");
        else tracks.remove(track);
    }
    
    @Override
    public int getLength(){
        int sum = 0;
        for(Track x : tracks) sum += x.getLength();
        return sum;
    }
    
    @Override
    public String toString(){
        return "CD - " + super.toString();
    }

    @Override
    public void play() {
        System.out.println("Playing CD: " + getTitle());
        for(Track x : tracks) x.play();
    }
}
/*

*/
