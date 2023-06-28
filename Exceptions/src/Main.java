class JoyException extends Exception {
	public JoyException(String msg) {
		super(msg);
	}
}

public class Main {

	public static void main(String[] args) {
		int i = 20;
		int j = 0;
		
		try {
			j = 18/i;
			
			if(j == 0) {
				throw new JoyException("Hey! j is zero!!");
			}
		}
		catch(Exception e) {
			System.out.println("Exception caught ==> " + e.getMessage());
		}
		
		System.out.println("The value is: " + j);
		System.out.println("End of program!!");
	}

}
