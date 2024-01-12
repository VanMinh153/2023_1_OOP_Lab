// 

package hust.soict.hedspi.test.cart;
import hust.soict.hedspi.aims.cart.Cart;
import hust.soict.hedspi.aims.media.Disc;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class CartTest {
    public static void main(String[] args) {
        Cart anOrder = new Cart();
        
        // Input Disc
        Disc dvd1 = new Disc("Naruto", "Anime", "Kishimoto Masashi", 90, 29.04f);
        anOrder.addDVD(dvd1);       
        Disc dvd2 = new Disc("One Piece", "Anime", "Oda", 78, 39.04f);
        anOrder.addDVD(dvd2);        
        Disc dvd3 = new Disc("Doraemon", "Anime", "Fujiko", 88, 19.04f);
        anOrder.addDVD(dvd3);       
        Disc dvd4 = new Disc("Conan");
        anOrder.addDVD(dvd4);
        Disc dvd5 = new Disc("When You Finish Saving the World", "Romantic", "Jesse Eisenberg", 120, 29.04f);
        anOrder.addDVD(dvd5);
        Disc dvd6 = new Disc("Knock at the Cabin", "Action", "M. Night Shyamalan", 144, 30f);
        anOrder.addDVD(dvd6);
        Disc dvd7 = new Disc("Cocaine Bear", "Action", "Elizabeth Banks", 90, 20f);
        anOrder.addDVD(dvd7);
        Disc dvd8 = new Disc("Air", "Action", "Ben Affleck", 155, 34f);
        anOrder.addDVD(dvd8);
        Disc dvd9 = new Disc("The Covenant", "Action", "Guy Ritchie", 78, 19.99f);
        anOrder.addDVD(dvd9);
        Disc dvd10 = new Disc("Barbie", "Cartoon", "Greta Gerwig", 122, 10.2f);
        anOrder.addDVD(dvd10);
        Disc dvd11 = new Disc("A Haunting in Venice", "Action", "Kenneth Branagh", 134, 34.2f);
        anOrder.addDVD(dvd11);
        Disc dvd12 = new Disc("Somebody I Used to Know", "Romantic", "Dave Franco", 122, 23.44f);
        anOrder.addDVD(dvd12);
        Disc dvd13 = new Disc("Rebel Moon", "Action", "Zack Snyder", 145, 23.23f);
        anOrder.addDVD(dvd13);
        Disc dvd14 = new Disc("Lift", "Action", "F. Gary Gray", 123, 23.24f);
        anOrder.addDVD(dvd14);
        Disc dvd15 = new Disc("If Anything Happens I Love You", "Emotional", "F. Gary Gray", 113, 13.24f);
        anOrder.addDVD(dvd15);
        
        // Remove Disc
        anOrder.removeDVD(dvd2);
        
        // Test the print method
        anOrder.print();     
        
        // Test the search by title methods
        anOrder.searchByTitle("you");
        anOrder.searchByTitle("iii");
    }
}
/*

*/
