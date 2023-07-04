// Dynamic Method Dispatch or Runtime Polymorphism in Java
// NOTES:
// 1. Variables in Java do not follow Polymorphism. Overriding is only applicable to methods but not to 
// variables.


public class Main {

	public static void main(String[] args) {
		Computer obj = new Laptop();
		obj.show();
		System.out.println(obj.x); // Since variables are not overridden, so the statement “a.x” will always refer to data member of super class.
		
			
		obj = new Computer();
		obj.show();
		
		
		Laptop obj2 = new Laptop();
		obj2.show();
		System.out.println(obj2.x);
	}
}
