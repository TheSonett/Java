
class Student {
	Student() {
		System.out.println("Object created!!");
	}
	
	public Student getRef() {
		return this;
	}
	
	public Student printName() { System.out.println("Joy"); return this; }
	public Student printAge() { System.out.println(10); return this; }
}


public class Main {

	public static void main(String[] args) {
		// new Student(); // anonymous object
		
		new Student().printAge().printName();
	}

}
