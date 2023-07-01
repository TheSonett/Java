// length vs length()
// => The length variable is applicable to an array but not for string objects whereas the length() method is applicable for string objects but not for arrays.

import java.util.*;

public class ReverseString {
    private static Scanner src = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter a string to reverse it ==> ");
        String string = src.nextLine();
        
        String reverseString = "";
        for(int i = string.length() - 1; i >= 0; i--) {
            reverseString += string.charAt(i);
        }
        
        System.out.println(reverseString);
    }
}
