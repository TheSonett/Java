class A {
	A() { System.out.println("A constructor called!!"); }
	
	void print1() {
		System.out.println("In A print");
	}
}

class B extends A {
	B() { System.out.println("B constructor called!!"); }
	
	void print2() {
		System.out.println("In B print");
	}
}


public class Main {

	public static void main(String[] args) {
		A obj = (A) new B(); // up-casting
		obj.print1();
		
		
		B obj2 = (B) obj; // down-casting
		obj2.print2();
		
		
	}

}
