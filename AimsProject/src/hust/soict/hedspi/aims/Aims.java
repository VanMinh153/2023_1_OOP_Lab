package hust.soict.hedspi.aims;

import hust.soict.hedspi.aims.cart.Cart;
import hust.soict.hedspi.aims.media.DVD;
import hust.soict.hedspi.aims.media.CD;
import hust.soict.hedspi.aims.media.Book;
import hust.soict.hedspi.aims.media.Disc;
import hust.soict.hedspi.aims.media.Media;
import hust.soict.hedspi.aims.media.Track;
import hust.soict.hedspi.aims.store.Store;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Aims {
    static Cart anOrder = new Cart();
    static Store store = new Store();
    public static void main(String[] args) {     
        // Input Media to store
        Media dvd1 = new DVD(1, "When You Finish Saving the World", "Romantic", "Jesse Eisenberg", 120, 29.04f);
        store.addMedia(dvd1);
        Media dvd2 = new DVD(2, "Knock at the Cabin", "Action", "M. Night Shyamalan", 144, 30f);
        store.addMedia(dvd2);
        Media dvd3 = new DVD(3, "Cocaine Bear", "Action", "Elizabeth Banks", 90, 20f);
        store.addMedia(dvd3);
        Media dvd4 = new DVD(4, "Air", "Action", "Ben Affleck", 155, 34f);
        store.addMedia(dvd4);
        Media dvd5 = new DVD(5, "The Covenant", "Action", "Guy Ritchie", 78, 19.99f);
        store.addMedia(dvd5);
        Media dvd6 = new DVD(6, "Barbie", "Cartoon", "Greta Gerwig", 122, 10.2f);
        store.addMedia(dvd6);
        Media dvd7 = new DVD(7, "A Haunting in Venice", "Action", "Kenneth Branagh", 134, 34.2f);
        store.addMedia(dvd7);
        Media dvd8 = new DVD(8, "Somebody I Used to Know", "Romantic", "Dave Franco", 122, 23.44f);
        store.addMedia(dvd8);
        Media dvd9 = new DVD(9, "Rebel Moon", "Action", "Zack Snyder", 145, 23.23f);
        store.addMedia(dvd9);
        Media dvd10 = new DVD(10, "Lift", "Action", "F. Gary Gray", 123, 23.24f);
        store.addMedia(dvd10);
        
        // CD(int id, String title, String category, String director, int length, float cost, String artist)
        Media cd1 = new CD(1, "CD1", "Cartoon", "Quyet", 45, 22.5f, "Tom");
        store.addMedia(cd1);
        
        // Book(int id, String title, String category, float cost, ArrayList<String> authors)
         ArrayList<String> authors = new ArrayList<String>(Arrays.asList("Geeks","Abc"));
        Media book1 = new Book(1, "Dark nhan tam", "Self help", 9.9f, authors);
        store.addMedia(book1);
        
        // Show cart with format
//        store.print();

        Scanner sc = new Scanner(System.in);
        
        while(true){
            showMenu();
            int choose = Integer.parseInt(sc.nextLine());
            // 1. View store
            if(choose == 1) {
                while(true){
                    store.print();
                    storeMenu();
                    int choose2 = Integer.parseInt(sc.nextLine());
                    // 1. See a media’s details
                    if(choose2 == 1){
                        ArrayList<Media> foundItems = findMediaByTitle();
                        if(!foundItems.isEmpty()) {
                            while(true){
                                mediaDetailsMenu();
                                int choose3 = Integer.parseInt(sc.nextLine());
                                // Add to cart
                                if(choose3 == 1){
                                    addMediaToCartByTitle();
                                }
                                // Play
                                else if(choose3 == 2){
                                    playMediaByTitle();
                                }
                                // Back
                                else if(choose3 == 0) break;
                                else System.out.println("ERR: Please choose a number: 0-1-2 !");
                            }
                        }
                    }
                    // 2. Add a media to cart
                    else if(choose2 == 2){
                        addMediaToCartByTitle();
                    } 
                    // 3. Play a media
                    else if(choose2 == 3){
                        playMediaByTitle();
                    }
                    // 4. See current cart
                    else if(choose2 == 4){
                        seeCurrentCart();
                    }
                    // 0. Back
                    else if(choose2 == 0){
                        break;
                    }
                    else {
                        System.out.println("ERR: Please choose a number: 0-1-2-3-4 !");
                    }
                }             
            }
            // 2. Update store
            else if(choose == 2){
                while(true){
                    updateStoreMenu();
                    int choose2 = Integer.parseInt(sc.nextLine());
                    // 1. Add Media to Store
                    if(choose2 == 1){
                        Media newMedia = getMediaFromUser();
                        store.addMedia(newMedia);
                    }
                    // 2. Remove Media from Store
                    else if(choose2 == 2){
                        RemoveMediaFromStoretByTitle();
                    }
                    // 0. Back
                    else if(choose2 == 0){
                        break;
                    }
                    else {
                        System.out.println("ERR: Please choose a number: 0-1-2-3-4 !");
                    }
                }
            }
            //3. See current cart
            else if(choose == 3){
                seeCurrentCart();
            }
            else if(choose == 0) System.exit(0);
            else System.out.println("ERR: Please choose a number: 0-1-2-3 !");
        }
    }
    
    public static void showMenu(){
        System.out.println("AIMS: ");
        System.out.println("--------------------------------");
        System.out.println("1. View store");
        System.out.println("2. Update store");
        System.out.println("3. See current cart");
        System.out.println("0. Exit");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 0-1-2-3 : ");
    }
    
    public static void storeMenu(){
        System.out.println("Options: ");
        System.out.println("--------------------------------");
        System.out.println("1. See a media’s details");
        System.out.println("2. Add a media to cart");
        System.out.println("3. Play a media");
        System.out.println("4. See current cart");
        System.out.println("0. Back");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 0-1-2-3-4 : ");
    }
    
    public static void mediaDetailsMenu(){
        System.out.println("Options: ");
        System.out.println("--------------------------------");
        System.out.println("1. Add to cart");
        System.out.println("2. Play");
        System.out.println("0. Back");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 0-1-2 : ");
    }
    
    public static void updateStoreMenu(){
        System.out.println("Options: ");
        System.out.println("--------------------------------");
        System.out.println("1. Add Media to Store");
        System.out.println("2. Remove Media from Store");
        System.out.println("0. Back");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 0-1-2 : ");
    }
    
    public static void cartMenu(){
        System.out.println("Options: ");
        System.out.println("--------------------------------");
        System.out.println("1. Filter media in cart");
        System.out.println("2. Sort media in cart");
        System.out.println("3. Remove media from cart");
        System.out.println("4. Play a media");
        System.out.println("5. Place order");
        System.out.println("0. Back");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 0-1-2-3-4-5");
    }
        
    public static void filterMediaMenu(){
        System.out.println("Options: ");
        System.out.println("--------------------------------");
        System.out.println("1. Filter by ID");
        System.out.println("2. Filter by title");
        System.out.println("0. Back");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 0-1-2");
    }
    
    public static void sortMediaMenu(){
        System.out.println("Options: ");
        System.out.println("--------------------------------");
        System.out.println("1. Sort by ID");
        System.out.println("2. Sort by title");
        System.out.println("0. Back");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 0-1-2");
    }
    
    public static int getChooseFromUser(){
        boolean ok = false;
        int choose = -1;
        Scanner sc = new Scanner(System.in);
        while(ok == false){
            try {
                choose = Integer.parseInt(sc.nextLine());
                ok = true;
            } catch (NumberFormatException e) {
                // Handle the exception if the user input is not a number
                ok = false;
                System.out.println("Invalid input. Please enter a valid number.");
            } finally {
                // Close the scanner to avoid resource leaks
            }
        }
        sc.close();
        return choose;
    }
    
    public static ArrayList<Media> findMediaByTitle(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter media's title : ");
        String title = sc.nextLine();
        boolean found = false;
        ArrayList<Media> foundItems = new ArrayList<>();
        for(int i = 0; i < store.getItemsInStore().size(); i++){
            // Case insensitive
            if(store.getItemsInStore().get(i).getTitle().toLowerCase().contains(title.toLowerCase())){
                found = true;
                foundItems.add(store.getItemsInStore().get(i));
                System.out.println(store.getItemsInStore().get(i));                                
            }
        }
        if(!found) System.out.println("NOT FOUND");
        return foundItems;
    }
    
    public static void addMediaToCartByTitle(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter media's title : ");
        String title2 = sc.nextLine().toLowerCase();
        boolean ok = false;
        for(int i = 0; i < store.getItemsInStore().size(); i++){
            if(store.getItemsInStore().get(i).getTitle().toLowerCase().equals(title2)){
                ok = true;
                anOrder.addMedia(store.getItemsInStore().get(i));
            }                                   
        }
        if(ok) System.out.println("Number of Media in the current cart: " + anOrder.getItemsOrdered().size());
        else System.out.println("ERR: NOT FOUND");
    }
    
    public static void playMediaByTitle(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter media's title : ");
        String title2 = sc.nextLine().toLowerCase();
        boolean ok = false;
        for(int i = 0; i < store.getItemsInStore().size(); i++){
            if(store.getItemsInStore().get(i).getTitle().toLowerCase().equals(title2)){
                ok = true;
                if(store.getItemsInStore().get(i) instanceof Disc){
                    ((Disc) store.getItemsInStore().get(i)).play();
                }
                else System.out.println("ERR: Can't play a book!");
            }                                   
        }
        if(!ok) System.out.println("ERR: NOT FOUND");
    }
    
    public static void RemoveMediaFromCartByTitle(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter media's title : ");
        String title2 = sc.nextLine().toLowerCase();
        boolean ok = false;
        for(int i = 0; i < anOrder.getItemsOrdered().size(); i++){
            if(store.getItemsInStore().get(i).getTitle().toLowerCase().equals(title2)){
                ok = true;
                anOrder.removeMedia(anOrder.getItemsOrdered().get(i));
            }                                   
        }
        if(!ok) System.out.println("ERR: NOT FOUND");
    }
    
    public static void RemoveMediaFromStoretByTitle(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter media's title : ");
        String title2 = sc.nextLine().toLowerCase();
        boolean ok = false;
        for(int i = 0; i < store.getItemsInStore().size(); i++){
            if(store.getItemsInStore().get(i).getTitle().toLowerCase().equals(title2)){
                ok = true;
                store.removeMedia(store.getItemsInStore().get(i));
            }                                   
        }
        if(!ok) System.out.println("ERR: NOT FOUND");
    }
    
    public static void filterCartByID(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter media's ID");
        String id = sc.nextLine();
        boolean found = false;
        for(int i = 0; i < anOrder.getItemsOrdered().size(); i++){
            // Case insensitive
            if(String.valueOf(String.valueOf(anOrder.getItemsOrdered().get(i).getId())).toLowerCase().contains(id)){
                found = true;
                System.out.println(anOrder.getItemsOrdered().get(i));                                
            }
        }
        if(!found) System.out.println("NOT FOUND");
    }
    
    public static void filterCartByTitle(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter media's title");
        String title = sc.nextLine();
        boolean found = false;
        for(int i = 0; i < anOrder.getItemsOrdered().size(); i++){
            // Case insensitive
            if(anOrder.getItemsOrdered().get(i).getTitle().toLowerCase().contains(title.toLowerCase())){
                found = true;
                System.out.println(anOrder.getItemsOrdered().get(i));                                
            }
        }
        if(!found) System.out.println("NOT FOUND");
    }
    
    public static void seeCurrentCart(){
        Scanner sc = new Scanner(System.in);
        while(true){
            anOrder.print();
            if(anOrder.getItemsOrdered().isEmpty()) return;
            cartMenu();
            int choose3 = Integer.parseInt(sc.nextLine());
            // 1. Filter media in cart
            if(choose3 == 1){
                while(true){
                    filterMediaMenu();
                    int choose4 = Integer.parseInt(sc.nextLine());
                    // Filter by ID
                    if(choose4 == 1){
                        filterCartByID();
                    }
                    // Filter by title
                    else if(choose4 == 2){
                        filterCartByTitle();
                    }
                    // Back
                    else if(choose4 == 0) break;
                    else System.out.println("ERR: Please choose a number: 0-1-2 !");
                }
            }
            // 2. Sort media in cart
            else if(choose3 == 2){
                while(true){
                    sortMediaMenu();
                    int choose4 = Integer.parseInt(sc.nextLine());
                    // 1. Sort by title
                    if(choose4 == 1){
                        anOrder.sortByTitle();
                        anOrder.print();
                    }
                    // 2. Sort by cost
                    else if(choose4 == 2){
                        anOrder.sortByCost();
                        anOrder.print();
                    }
                    // Back
                    else if(choose4 == 0) break;
                    else System.out.println("ERR: Please choose a number: 0-1-2 !");
                }
            }
            // 3. Remove media from cart
            else if(choose3 == 3){
                RemoveMediaFromCartByTitle();
            }
            // 4. Play a media
            else if(choose3 == 4){
                playMediaByTitle();
            }
            // 5. Place order
            else if(choose3 == 5){
                anOrder.place();
            }
            // Back
            else if(choose3 == 0) break;
            else System.out.println("ERR: Please choose a number: 0-1-2 !");
        }
    }
    
    public static Media getMediaFromUser(){
        //DVD(int id, String title, String category, String director, int length, float cost)
        //CD(int id, String title, String category, String director, int length, float cost, String artist)
        //Book(int id, String title, String category, float cost, ArrayList<String> authors)    
        Scanner sc = new Scanner(System.in);
        String type;
        System.out.println("Please enter information of new Media");
        do{
            System.out.println("Type (DVD/CD/Book): ");
            type = sc.nextLine();
            if(!type.equals("DVD") || type.equals("CD") || type.equals("Book"))
                System.out.println("Please enter DVD/CD/Book !");
        } while(!type.equals("DVD") || type.equals("CD") || type.equals("Book"));

        System.out.println("Title: ");
        String title = sc.nextLine();
        System.out.println("Category: ");
        String category = sc.nextLine();
        System.out.println("Cost: ");
        String director = "";
        int length = 0;
        float cost = Float.parseFloat(sc.nextLine());
        if(type.equals("DVD") || type.equals("CD")){
            System.out.println("Director: ");
            director = sc.nextLine();
            System.out.println("Length: ");
            length = Integer.parseInt(sc.nextLine());
        }
        String artist = "";
        if(type.equals("CD")){
            System.out.println("Artist: ");
            artist = sc.nextLine();

        }
        ArrayList<String> authors2 = new ArrayList<>();
        if(type.equals("Book")){
            System.out.println("Authors(separated by commas): ");
            String[] s = sc.nextLine().split("\\s+");
            for(String x : s) authors2.add(x);
        }
        if(type.equals("DVD")) 
            return new DVD(store.getDVDqty() + 1, title, category, director, length, cost);
        else if(type.equals("CD"))
            return new CD(store.getCDqty() + 1, title, category, director, length, cost, artist);
        else return new Book(store.getBookQty() + 1, title, category, cost, authors2);
    }
    
    public static void getInput(){
        try {
            File myObj = new File("input.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                // Input DVD
                int qtyDVD = Integer.parseInt(myReader.nextLine());
                for(int i = 1; i <= qtyDVD; i++){
                    Media newDVD = new DVD(i, myReader.nextLine(), myReader.nextLine(), myReader.nextLine(), 
                            Integer.parseInt(myReader.nextLine()), Float.parseFloat(myReader.nextLine()));
                    anOrder.addMedia(newDVD);
                }
                
                // Input CD
                int qtyCD = Integer.parseInt(myReader.nextLine());
                for(int i = 1; i <= qtyCD; i++){
                    ArrayList<Track> tracks = new ArrayList<>();
                    int length = 0;
                    int qtyTrack = Integer.parseInt(myReader.nextLine());
                    while(qtyTrack-- != 0) {
                        Track track = new Track(myReader.nextLine(), Integer.parseInt(myReader.nextLine()));
                        length += track.getLength();
                        tracks.add(track);
                    }
                    Media newCD = new CD(i, myReader.nextLine(), myReader.nextLine(), myReader.nextLine(), length, 
                                        Float.parseFloat(myReader.nextLine()), myReader.nextLine());
                    anOrder.addMedia(newCD);
                }
                
                // Input Book
                int qtyBook = Integer.parseInt(myReader.nextLine());
                for(int i = 1; i <= qtyBook; i++){
                    Media newBook = new Book(myReader.nextLine(), myReader.nextLine())
                }
            }
            myReader.close();
        } catch (FileNotFoundException e){
            System.out.println("An error occurred.");
        }
    }
}
