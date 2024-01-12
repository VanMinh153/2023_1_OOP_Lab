package hust.soict.hedspi.test.disc;


import hust.soict.hedspi.aims.media.Disc;

// 
public class TestPassingParameter {
    public static void main(String[] args) {
        Disc jungleDVD = new Disc("Jungle");
        Disc cinderellaDVD = new Disc("Cinderella");
        
        swap(jungleDVD, cinderellaDVD);
        System.out.println("jungle dvd title : " + jungleDVD.getTitle());
        System.out.println("cinderella title : " + cinderellaDVD.getTitle());
        
        changeTitle(jungleDVD, cinderellaDVD.getTitle());
        System.out.println("jungle dvd title : " + jungleDVD.getTitle());
    }
    
    public static void swap(Object o1, Object o2){
        Object tmp = o1;  
        o1 = o2;
        o2 = tmp;
    }
    
    public static void changeTitle(Disc dvd, String title){
        String oldTitle = dvd.getTitle();
        dvd.setTitle(title);
        dvd = new Disc(oldTitle);
    }
}
/*

*/
