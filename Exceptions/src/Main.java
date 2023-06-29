// NOTES:
// 1. A compile-time error generally refers to the errors that correspond to the semantics or syntax.
// 2. A runtime error refers to the error that we encounter during the code execution during runtime.
// 3. It is the effective way to handle the runtime errors.
// 4. Exception is an unwanted or unexpected event, which occurs during the execution of a program.
// 5. Two types : Checked -> IO or Compile time exception
//				  Unchecked -> Runtime or Null Pointer exception


@SuppressWarnings("serial")
class JoyException extends Exception {
	public JoyException(String msg) {
		super(msg);
	}
}

public class Main {

	public static void main(String[] args) {
		int i = 2;
		int j = 0;
		
		try {
			j = 18/i;
			
			if(j == 0) {
				throw new JoyException("Hey! j is zero!!");
			}
		}
		catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}
		catch(Exception e) {
			System.out.println("Exception caught ==> " + e.getMessage());
		}
		finally {
			System.out.println("Checked all exceptions!");
		}
		
		System.out.println("The value is: " + j);
		System.out.println("End of program!!");
	}

}
