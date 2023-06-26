// NOTES:
// 1. When a method is declared as final, it cannot be overridden by a subclass.
// 2. Once we assign a final variable, we cannot change it's data.
// 2. We can restrict class inheritance by making use of the final class. Final classes cannot be extended or inherited. 
// 3. We cannot make an interface final in Java.

class A {
	final public void show() {}
}

final class B extends A {
	// public void show() {} // cannot override
}

// class C extends B {} // error: class B cannot be inherited

public class Main {
	public final static double PI = 3.18;
	
	public static void main(String[] args) {
		new B();
		
		// PI++; // cannot be modified
		System.out.println(PI);		
	}

}
