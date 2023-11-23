import java.util.Scanner;

public class PrintTriagleStar {
    public static void main(String[] args) {
        int n;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter n: ");
        n = Integer.parseInt(scan.nextLine());

        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n * 2 - 1; j++){
                if(j <= n - i || j >= n + i) System.out.print(" ");
                else System.out.print("*");
            }
            System.out.println("\n");
        }
    }
}
