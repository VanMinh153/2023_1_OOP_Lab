package aims;

public class Aims {
    public static void main(String[] args) {
        Cart anOrder = new Cart();
        DVD dvd1 = new DVD("Naruto", "Anime", 
                "Kishimoto Masashi", 90, 29.04f);
        anOrder.addDVD(dvd1);
        
        DVD dvd2 = new DVD("One Piece", "Anime", 
                "Oda", 78, 39.04f);
        anOrder.addDVD(dvd2);
        
        DVD dvd3 = new DVD("Doraemon", "Anime", 
                "Fujiko", 88, 19.04f);
        anOrder.addDVD(dvd3);
        
        DVD dvd4 = new DVD("Conan");
        anOrder.addDVD(dvd4);
        
        System.out.print("Total cost is: ");
        System.out.println(anOrder.totalCost());
        anOrder.showCart();
        
        anOrder.removeDVD(dvd2);
        anOrder.showCart();
    }
}
