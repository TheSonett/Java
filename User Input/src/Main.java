import java.io.*;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// println() is belong to PrintStream class and System is the class where out is a static object of 
		// PrintStream.
		System.out.println("Enter a number: ");
		// System.in.read(); // it gives ASCII representation of the value which is not suitable.
		
		InputStreamReader in = new InputStreamReader(System.in); // it takes a InputStream object
		BufferedReader bf = new BufferedReader(in); // it takes an reader object
		
		Scanner scanner = new Scanner(System.in); // it takes a InputStream object
		
		try {
			//int num = Integer.parseInt(bf.readLine());
			//int num = scanner.nextInt(); // it reads only the value, not \n at the end.
			//scanner.nextLine(); // reading the leftover newline \n to solve the problem
			
			// or
			int num = Integer.parseInt(scanner.nextLine()); // best solution
			System.out.println(num);
			
			System.out.println("Enter your name: ");
			String name = scanner.nextLine(); // it reads \n from the previous step and skips the current line.
			
			System.out.println("Name: " + name);
			//bf.close();
			scanner.close();
		}
//		catch(IOException iox) {
//			System.out.println("Exception occured: " + iox.getMessage());
//		}
		catch(Exception ex) {
			System.out.println("Exception occured: " + ex.getMessage());
		}
	}
}
