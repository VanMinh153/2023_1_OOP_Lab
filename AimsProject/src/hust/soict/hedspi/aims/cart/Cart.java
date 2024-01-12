package hust.soict.hedspi.aims.cart;

import hust.soict.hedspi.aims.media.Disc;
import hust.soict.hedspi.aims.media.Media;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class Cart {
    private ArrayList<Media> itemsOrdered = new ArrayList<>();

    public Cart() {
    }

    public ArrayList<Media> getItemsOrdered() {
        return itemsOrdered;
    }
  
    public float totalCost(){
        float total = 0;
        for(Media x : itemsOrdered) total += x.getCost();
        return total;
    }
    
    public void searchByTitle(String title){
        boolean found = false;
        for(Media x : itemsOrdered){
//            if(x.)
        }
        if(!found) System.out.println("Not found! DVD with title \"" + title + "\"");
    }
    
    public void addMedia(Media media){
        if(itemsOrdered.contains(media)) System.out.println(media.getTitle() + " is already in the Cart !");
        else {
            itemsOrdered.add(media);
            System.out.println("Added " + media.getTitle() + " to Cart !");
        }
    }
    
    public void removeMedia(Media media){
        if(!itemsOrdered.contains(media)) System.out.println(media.getTitle() + " is not in the Cart");
        else {
            itemsOrdered.remove(media);
            System.out.println("Removed \"" + media.getTitle() + "\" from Cart");
        }
    }
    
//    public void showCart(){
//        for(Media x : itemsOrdered){
//            System.out.printf("%-5d%-20s%.2f", i + 1, itemsOrdered[i].getTitle(), itemsOrdered[i].getCost());
//            System.out.printf("\n");
//        }  
//        System.out.printf("%-5s%-20s%.2f", "", "Total cost", totalCost());
//        System.out.printf("\n");
//    }
    
    public void print(){
        if(itemsOrdered.isEmpty()){
            System.out.println("No media in Cart !");
            return;
        }
        System.out.println("***********************CART***********************");
        System.out.println("Ordered Items:");
        for(Media x : itemsOrdered) {
            System.out.println(x);
        }
        System.out.println("Total cost: " + String.format("%.2f $", totalCost()));
        System.out.println("***************************************************");
    }
    
    public void sortByTitle(){
        Collections.sort(itemsOrdered, (Media o1, Media o2) -> {
            if(!o1.getTitle().equals(o2.getTitle())) return o1.getTitle().compareTo(o2.getTitle());
            else {
                if(o2.getCost() > o1.getCost()) return 1;
                else return -1;
            }
        });
    }
    
    public void sortByCost(){
        Collections.sort(itemsOrdered, (Media o1, Media o2) -> {
            if(o1.getCost() != o2.getCost()){
                if(o2.getCost() > o1.getCost()) return 1;
                else return -1;
            }
            else return o1.getTitle().compareTo(o1.getTitle());
        });
    }
    
    public void place(){
        itemsOrdered.clear();
        System.out.println("Order is place successful");
    }
}
