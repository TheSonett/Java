import java.util.Scanner;

public class LeapYear {
    public static Scanner src = new Scanner(System.in);
    
    public static void main(String[] args) {
        System.out.println("Enter a year ==> ");
        int year = Integer.parseInt(src.nextLine());
        
        if(year % 400 == 0) {
            System.out.println(year + " is a leap year");
        }
        else if(year % 100 == 0) {
            System.out.println(year + " is not a leap year");
        }
        else if(year % 4 == 0) {
            System.out.println(year + " is a leap year");
        }
        else {
            System.out.println(year + " is not a leap year");
        }
    }
}
