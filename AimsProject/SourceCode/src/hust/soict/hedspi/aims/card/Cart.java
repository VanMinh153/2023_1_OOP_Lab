package hust.soict.hedspi.aims.card;

import hust.soict.hedspi.aims.disc.DVD;

public class Cart {
    private static final int MAX_NUMBERS_ORDERED = 20;
    private DVD itemsOrdered[] = new DVD[MAX_NUMBERS_ORDERED];
    private int qtyOrdered = 0;
    
    public void addDVD(DVD new_DVD){
        if(qtyOrdered < 20) {
            itemsOrdered[qtyOrdered++] = new_DVD;
            System.out.println("The " + new_DVD.getTitle() + " has been added");
        }
        else System.out.println("Your cart is almost full! "
                + "(Max of quantity is 20)");
    }
    
    public void removeDVD(DVD remove_DVD){
        for(int i = 0; i < qtyOrdered - 1; i++){
            if(itemsOrdered[i] == remove_DVD){
                for(int j = i; j < qtyOrdered - 1; j++){
                    itemsOrdered[j] = itemsOrdered[j + 1];
                }
                qtyOrdered--;
            }
        }
        if(itemsOrdered[qtyOrdered - 1] == remove_DVD) qtyOrdered--;
        System.out.println("Remove sucessfull!");
    }
    
    public float totalCost(){
        float total = 0;
        for(int i = 0; i < qtyOrdered; i++){
            total += itemsOrdered[i].getCost();
        }
        return total;
    }
    
    public void showCart(){
        for(int i = 0; i < qtyOrdered; i++){
            System.out.printf("%-5d%-20s%.2f", i + 1, itemsOrdered[i].getTitle(), itemsOrdered[i].getCost());
            System.out.printf("\n");
        }  
        System.out.printf("%-5s%-20s%.2f", "", "Total cost", totalCost());
        System.out.printf("\n");
    }
}
