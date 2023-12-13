// 

package hust.soict.hedspi.aims.store;
import hust.soict.hedspi.aims.media.Book;
import hust.soict.hedspi.aims.media.CD;
import hust.soict.hedspi.aims.media.DVD;
import hust.soict.hedspi.aims.media.Disc;
import hust.soict.hedspi.aims.media.Media;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Store {
    private ArrayList<Media> itemsInStore = new ArrayList<>();
    
    // Constructor
    public Store() {
        Media dvd1 = new DVD(1, "When You Finish Saving the World", "Romantic", "Jesse Eisenberg", 120, 29.04f);
        itemsInStore.add(dvd1);
        Media dvd2 = new DVD(2, "Knock at the Cabin", "Action", "M. Night Shyamalan", 144, 30f);
        itemsInStore.add(dvd2);
        Media dvd3 = new DVD(3, "Cocaine Bear", "Action", "Elizabeth Banks", 90, 20f);
        itemsInStore.add(dvd3);
        Media dvd4 = new DVD(4, "Air", "Action", "Ben Affleck", 155, 34f);
        itemsInStore.add(dvd4);
        Media dvd5 = new DVD(5, "The Covenant", "Action", "Guy Ritchie", 78, 19.99f);
        itemsInStore.add(dvd5);
        Media dvd6 = new DVD(6, "Barbie", "Cartoon", "Greta Gerwig", 122, 10.2f);
        itemsInStore.add(dvd6);
        Media dvd7 = new DVD(7, "A Haunting in Venice", "Action", "Kenneth Branagh", 134, 34.2f);
        itemsInStore.add(dvd7);
        Media dvd8 = new DVD(8, "Somebody I Used to Know", "Romantic", "Dave Franco", 122, 23.44f);
        itemsInStore.add(dvd8);
        Media dvd9 = new DVD(9, "Rebel Moon", "Action", "Zack Snyder", 145, 23.23f);
        itemsInStore.add(dvd9);
        Media dvd10 = new DVD(10, "Lift", "Action", "F. Gary Gray", 123, 23.24f);
        itemsInStore.add(dvd10);
        
        // CD(int id, String title, String category, String director, int length, float cost, String artist)
        Media cd1 = new CD(1, "CD1", "Cartoon", "Quyet", 45, 22.5f, "Tom");
        itemsInStore.add(cd1);
        
        // Book(int id, String title, String category, float cost, ArrayList<String> authors)
         ArrayList<String> authors = new ArrayList<String>(Arrays.asList("Geeks","Abc"));
        Media book1 = new Book(1, "Dark nhan tam", "Self help", 9.9f, authors);
        
        itemsInStore.add(book1);
    }

    public ArrayList<Media> getItemsInStore() {
        return itemsInStore;
    }
    
    
    // Method
    public void addMedia(Media media){
    if(itemsInStore.contains(media)) System.out.println(media.getTitle() + " is already in the Store !");
    else {
        itemsInStore.add(media);
        System.out.println("Added " + media.getTitle() + " to Store !");
    }
}
    
    public void removeMedia(Media media){
        if(!itemsInStore.contains(media)) System.out.println(media.getTitle() + " is not in the Store");
        else {
            itemsInStore.remove(media);
            System.out.println("Removed \"" + media.getTitle() + "\" from Store");
        }
    }
    
    public int getDVDqty(){
        int qty = 0;
        for(Media x : itemsInStore) {
            if(x instanceof DVD) qty++;
        }
        return qty;
    }
    
    public int getCDqty(){
        int qty = 0;
        for(Media x : itemsInStore) {
            if(x instanceof CD) qty++;
        }
        return qty;
    }
    
    public int getBookQty(){
        int qty = 0;
        for(Media x : itemsInStore) {
            if(x instanceof Book) qty++;
        }
        return qty;
    }
    
    public void print(){
        System.out.println("***********************STORE***********************");
        for(Media x : itemsInStore) {
            System.out.println(x);
        }
        System.out.println("***************************************************");
    }
}
/*

*/
