// 

package hust.soict.hedspi.aims.store;
import hust.soict.hedspi.aims.media.Disc;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class StoreTest {
    public static void main(String[] args) {
        Store store = new Store();
        
        // Test addDVD
        Disc dvd1 = new Disc("Naruto", "Anime", "Kishimoto Masashi", 90, 29.04f);
        store.addDVD(dvd1);       
        Disc dvd2 = new Disc("One Piece", "Anime", "Oda", 78, 39.04f);
        store.addDVD(dvd2);        
        Disc dvd3 = new Disc("Doraemon", "Anime", "Fujiko", 88, 19.04f);
        store.addDVD(dvd3);       
        Disc dvd4 = new Disc("Conan");
        store.addDVD(dvd4);
        Disc dvd5 = new Disc("When You Finish Saving the World", "Romantic", "Jesse Eisenberg", 120, 29.04f);
        store.addDVD(dvd5);
        
        store.print();
        
        // Test removeDVD method
        store.removeDVD(dvd5);
        store.removeDVD(dvd2);
        store.print();
    }
}
/*

*/
