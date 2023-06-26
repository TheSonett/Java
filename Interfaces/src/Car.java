// NOTES:
// 1. Interface is not a class like abstract
// 2. By default every method is "public abstract" in the interface.
// 3. It works as a blue-print for a class.
// 4. It can have variables but by default they are "final and static"
// 5. Interface cannot have non-abstract methods and it's body.
// 6. Interfaces cannot have constructors like an abstract class.
// 7. Cannot create it's object but we can have inner class + anonymous inner class object like abstract class. 

public interface Car {
	public abstract void show();
	void print(); // by default, it is public abstract
	
	public String name = "Joy";
	//public Car() {}; // not allowed
	// public void show2() {} // not allowed	
	
	static class Me {
		public void show() {
			System.out.println("Me class show() function called!!");
		}
	}
	
	
	class Me2 {
		public void show() {
			System.out.println("Me2 class show() function called!!");
		}
	}

}
