import java.util.*;

public class Factorial {
    public static int fact(int n) {
        if(n == 0) {
            return 1;
        }
        
        return n * fact(n - 1);
    }

    public static int fact2(int n) {
        int fact = 1;

        if(n == 0)
            return fact;

        for(int i = 1; i <= n; i++) {
            fact *= i;
        }

        return fact;
    }

    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = Integer.parseInt(src.nextLine());

        int result = fact2(n);
        System.out.println(result);


        src.close();
    }
}
