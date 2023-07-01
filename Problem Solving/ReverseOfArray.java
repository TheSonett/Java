import java.util.*;

public class ReverseOfArray {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        int size = 6;
        int[] array = new int[size];

        System.out.println("Enter " + size + " elements ==> ");
        for(int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(src.nextLine());
        }

        for(int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        System.out.println("\nAfter reversing the array ==> ");
        
        for(int i = 0, j = array.length - 1; i < array.length / 2; i++, j--) { // NOTE: multiple conditions is not allowed in java.
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }

        for(int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        src.close();
    }
}
