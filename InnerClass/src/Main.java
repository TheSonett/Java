// NOTES:
// 1. Only Inner classes can be static. Outside class cannot be static


// static class A {} // not possible

class Student {
	Student() {}
	
	public void show() { System.out.println("Student class show() method called!!"); }
	
	// static inner class
	static class Me {
		public int rollNo;
		
		Me(int rollNo) { this.rollNo = rollNo; }
		public void show() { System.out.println("My roll no is " + rollNo); }
	}
	
	// non static inner class
	class Me2 {
		public int rollNo;
			
		Me2(int rollNo) { this.rollNo = rollNo; }
		public void show() { System.out.println("My roll no is " + rollNo); }
	}
}

abstract class MySelf {
	abstract public void show();
} 

public class Main {

	public static void main(String[] args) {
		Student s1 = new Student() { // anonymous inner class
			public void show() { System.out.println("Student inner class called!!"); }
		};
		
		s1.show();
		
		Student s2 = new Student();
		s2.show();
		
		
		Student.Me obj = new Student.Me(5);
		obj.show();
		
		// Student.Me2 obj2 = new Student.Me2(10); // not allowed as inner class is non-static
		// obj2.show();
		
		// Here, we're not creating an object of abstract class which is not possible, inner class 
		// constructor gets created.
		MySelf obj3 = new MySelf() { // So, We can use anonymous inner class for abstract class as well.
			@Override
			public void show() {
				System.out.println("Inner class show() function called!!");
			}
		};
		
		obj3.show();
	}

}
