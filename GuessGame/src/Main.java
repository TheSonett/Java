// Notes:
// 1. A java file can have only one public class
// 2. A single java file can have multiple non-public classes.
// 3. The class name should be same as the file name if the class is public.
//      For non-public, the class name can be anything.
// 4. Java is not a purely object-oriented programming language as it also supports
//      primitive data-types which is basically not the classes.

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        guessedNumber();
    }

    public static void guessedNumber() {
        try (Scanner input = new Scanner(System.in)) {
            boolean isGuessed = false;
            do {
                System.out.println("Guess the number between 1 to 5");
                int myNumber = input.nextInt();
                int randomNumber = new Random().nextInt(5) + 1;

                if (randomNumber == myNumber) {
                    System.out.println("You guessed the correct number!!");
                    isGuessed = true;
                    break;
                }

                System.out.println("You guessed number is incorrect!!");
                System.out.println("You correct number is: " + randomNumber);
            }
            while(!isGuessed);
        }
    }
}
