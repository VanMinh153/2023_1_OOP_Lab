import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
public class NumberOfDays {
    static boolean checkYear(int year) { 
    	return (((year % 4 == 0) && (year % 100 != 0)) || 
            (year % 400 == 0)); 
    } 
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter month: ");
        String month = keyboard.nextLine();
        System.out.println("Enter year");
        int year = keyboard.nextInt();

        String[] DaysIs31 = {"January", "Jan.", "1", "March", "Mar.", "3",
                            "May", "5", "July", "Jul", "7", 
                            "August", "Aug.", "Aug", "8",
                            "October", "Oct.", "Oct", "10",
                            "December", "Dec.", "Dec", "12"};
        String[] DaysIs30 = {"April", "Apr.", "Apr", "4",
                            "June", "Jun", 
                            "September", "Sept.","Sep", "9",
                            "November", "Nov.", "Nov", "11"};
        String[] MonthIsFeb = {"February", "Feb.", "Feb", "2"};

        List<String> DaysIs31List = new ArrayList<>(Arrays.asList(DaysIs31));        
        List<String> DaysIs30List = new ArrayList<>(Arrays.asList(DaysIs30));
        List<String> MonthIsFebList = new ArrayList<>(Arrays.asList(MonthIsFeb));
        if(DaysIs30List.contains(month)) System.out.println(30);        
        if(DaysIs31List.contains(month)) System.out.println(31);
        else if(MonthIsFebList.contains(month)){
            if(checkYear(year)) System.out.println(29);
            else System.out.println(28);
        }
        else System.out.println("Invalid input");

    }
}
