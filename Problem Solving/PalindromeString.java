import java.util.Scanner;
import java.util.Stack;

public class PalindromeString {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        System.out.println("Enter a string ==>");
        String str = src.nextLine();
        System.out.println("User input => " + str);

        Stack<Character> st = new Stack<>();
        for(int i = 0; i < str.length(); i++) {
            st.add(str.charAt(i));
        }

        String reverseString = "";
        while(!st.isEmpty()) {
            reverseString += st.pop();
        }

        System.out.println("Reversed new string => " + str);
        if(str.equals(reverseString)) {
            System.out.println("It is a palindrome string");
        }
        else {
            System.out.println("It is not a palindrome string");
        }

        src.close();
    }
}
