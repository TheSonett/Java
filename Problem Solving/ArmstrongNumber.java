import java.util.Scanner;

public class ArmstrongNumber {
    private static Scanner src = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter a number ==> ");
        int number = Integer.parseInt(src.nextLine());
        
        int count = 0;
        int temp = number; // for counting
        int temp2 = number; // for calculation
        int result = 0;
        
        // count the number
        while(temp != 0) {
            count++;
            temp = temp / 10;
        }
        
        // element^count
        while(temp2 != 0) {
            int lastElement = temp2 % 10;
            result += Math.pow(lastElement, count);
            temp2 = temp2 / 10;
        }
        
        if(number == result)
            System.out.println("It is an armstrong number!!");
        else
            System.out.println("It is not an armstrong number!!");
        
    }
}