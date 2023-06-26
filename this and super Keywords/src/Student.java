// NOTES:
// 1. it is used to refer current class instance variable.
// 2. this() can be called only inside another constructor.

// 1. super can be used to refer immediate parent class instance variable.
// 2. super can be used to invoke immediate parent class method.
// 3. super() can be used to invoke immediate parent class constructor.
// 4. Remember, super() should be called first in the first constructor.

public class Student extends College { // Object is root class of all java classes. yes all the classes by default extend Object class in java.
	private String name;
	private int age;
	
	public Student(String collegeName) {
		super(collegeName);
		
		System.out.println("default constructor called!!");
	}
	
	public Student(String name, int age, String collegeName) {		
		this(collegeName);
		
		this.name = name;
		this.age = age;
	}
	
		
	@Override
	public String toString() {
		return "Name: " + name + ", Age: " + age + ", College: " + getCollegeName();
	}
	
	
	// getters and setters
	public String getName() { return this.name; }
	public int getAge() { return this.age; }
	
	public void setName(String name) { this.name = name; }
	public void setAge(int age) { this.age = age; }
	
	
	// using this keyword
	public Student getCurrentObjectReference() {
		return this;
	}
	
	public boolean equals(Student other) {
		return ( (this.name == other.name) && (this.age == other.age) );
	}
	
	
	public int getAgeByThis() {
		return this.getAge();
	}
	
	public String getNameByThis() {
		return this.getName();
	}

}
