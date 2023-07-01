import java.util.*;

public class FibonacciSeries {
    static int[] cache = new int[200];
	public static int nthFibo(int n) {
		if(n == 0)
			return 0;
		else if(n == 1 || n == 2)
			return 1;
		
		if(cache[n] != -1) {
			return cache[n];
		}
		
		cache[n] = nthFibo(n - 1) + nthFibo(n - 2);
		return cache[n];
	}
	
	public static void fibonacciSeries(int n) {
		int i = 0;
		int j = 1;
		
		if(n < 2) {
			System.out.print(i + " " + j);
			return;
		}
		
		int sum = 0;
		int count = n;
		System.out.print(i + " " + j);
		while(count > 2) {
			sum = i + j;
			System.out.print(" " + sum);
			i = j;
			j = sum;
			
			count--;
		}
	}
	
	public static void main(String... args) {
		Scanner scanner = new Scanner(System.in);
		Arrays.fill(cache, -1);
		
		System.out.println("Enter nth number to get fibonacci of it :: ");
		int number = Integer.parseInt(scanner.nextLine());
		
		int result = nthFibo(number);
		System.out.println(result);
		
		fibonacciSeries(number);
	
		scanner.close();
    }
}