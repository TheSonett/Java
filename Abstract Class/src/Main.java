// NOTES:
// 1. We cannot create object of an abstract class.
// 2. If some other class inherits abstract class, we must have to override the methods.
// 3. Abstract class can have constructors. Because we need to initialize the non-abstract  
// 		methods and instance variables.

// 4. Java does not support abstract variables. Only abstract classes can have abstract methods.
// 5. We only declare abstract methods, it doesn't have body or defined.
// 6. Abstract class can have non-abstract methods and variables.
// 7. It is not mandatory that an abstract class should have an abstract method. 
// 		But an abstract method should be declare inside an abstract class.  

abstract class Car {
	
	public Car() {
		System.out.println("Abstract class constructor called!!");
	}
	
	public abstract void drive();
	public int price;
	public int modelNo;
	
	public void print() { System.out.println("Abstract class print() called!!"); }
	// public abstract int age; // not supported
	
}

class BMW extends Car {
	
	public BMW() {
		super(); // calling abstract class constructor
	}
	
	@Override
	public void drive() {
		System.out.println("Driving....");
	}
}

public class Main {

	public static void main(String[] args) {
		BMW obj = new BMW();
		obj.drive();
		obj.print();
		
		System.out.println();
		
		Car obj2 = new BMW();
		obj2.drive();
		obj2.print();
		
	}

}
