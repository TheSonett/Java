public class PrimeNumber {
     public static boolean checkPrime(int n) {
        int count = 0;

        for(int i = 1; i <= n; i++) {
            if(n % i == 0)
                count++;
        }

        if(count == 2)
            return true;
        else
            return false;
    }
    
    public static void main(String[] args) {
        int n = 53; // prime number
        //int n = 64; // not a prime number
        
        if(checkPrime(n)) {
            System.out.println(n + " is a prime number!!");
        }
        else {
            System.out.println(n + " is not a prime number!!");
        }
        
        //print all prime numbers
        for(int i = 1; i <= 100; i++) {
            if(checkPrime(i))
                System.out.print(i + " ");
        }
    }
}
