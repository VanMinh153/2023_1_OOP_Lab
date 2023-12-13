// 
package hust.soict.hedspi.aims.media;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Book extends Media{
    private ArrayList<String> authors = new ArrayList<>();

    public Book() {
    }

    public Book(int id, String title, String category, float cost, ArrayList<String> authors) {
        super(id, title, category, cost);
        this.authors = authors;
    }

    public ArrayList<String> getAuthors() {
        return authors;
    }
    
    public void addAuthor(String authorName){
        if(!authors.contains(authorName)) authors.add(authorName);
    }
    
    public void removeAuthor(String authorName){
        if(authors.contains(authorName)) authors.remove(authorName);
    }
    
    @Override
    public String toString(){
        return "Book - " + super.toString() + " - " + String.format("%.2f $", getCost());
    }
}
/*

*/
