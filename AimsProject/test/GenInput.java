
import java.util.Scanner;

// 
public class GenInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        for(int i = 1; i <= n; i++){
            System.out.println("Media dvd" + i + " = new DVD(" + i + ", \"" + sc.nextLine() + "\", " + "\"" + sc.nextLine() + "\", " + "\"" + sc.nextLine() + "\", "
            + sc.nextLine() + ", " + sc.nextLine() + ");");
            System.out.println("anOrder.addMedia(dvd" + i + ");");
        }
        
        System.out.println("");
        for(int i = 1; i <= n; i++){
            System.out.println("Media dvd" + i + " = new DVD(" + i + ", \"" + sc.nextLine() + "\", " + "\"" + sc.nextLine() + "\", " + "\"" + sc.nextLine() + "\", "
            + sc.nextLine() + ", " + sc.nextLine() + ");");
            System.out.println("anOrder.addMedia(dvd" + i + ");");
        }
    }
}
/*

*/
