import java.io.*;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Creating a new file
		File myFile = new File("file.txt");
		try {
			boolean isCreated = myFile.createNewFile();
			if(isCreated) {
				System.out.println("File created successfully!!");
			}
		} 
		catch (IOException e) {
			System.out.println("File not created!!");
			System.out.println(e.getMessage());
		}
		
		// Writing to the file
		try {
			// FileWriter fileWriter = new FileWriter("file.txt");
			FileWriter fileWriter = new FileWriter("file.txt", true); // without overwriting making the second argument = true
			fileWriter.write("Hello there!! My name is Joy Saha.\nI'm 23 years old!!");
			fileWriter.close();
		} catch (IOException e) {
			System.out.println("Writing operation failed!! :: " + e.getMessage());
		}
		
		
		// Reading from the file
//		try {
//			FileReader fileReader = new FileReader("file.txt");
//			int i;
//			while((i = fileReader.read()) != -1) {
//				System.out.print((char)i);
//			}
//			
//			fileReader.close();
//		} catch (IOException e) {
//			System.out.println("Reading operation failed!! :: " + e.getMessage());
//		}
		
		// or another way -> 
		
		try {
			File fileReader = new File("file.txt");
			Scanner scanner = new Scanner(fileReader);
			
			while(scanner.hasNextLine()) {
				System.out.println(scanner.nextLine());
			}
			
			scanner.close();
		}
		catch(FileNotFoundException e) {
			System.out.println(e.getMessage());
		}
		
		
		// renaming a file
		File myFile2 = new File("newName.txt");
		if(myFile.renameTo(myFile2)) {
			System.out.println("File renamed successful!!");
		}
		else {
			System.out.println("File already renamed!!");
		}
		
	}

}
