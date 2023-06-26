// Notes:
// 1. There is no static constructor.
// 2. A static method can have only static member variables.
// 3. A static member variable is distributed across all the objects.
// 4. We don't need an object to call a static method.


class Student {
    public String name;
    public int rollno;
    public static String collegeName;

    static {
        collegeName = "SurTech";
        System.out.println("Static block called!!"); // static block will execute only once.
    }

    public Student(String name, int rollno) {
    	System.out.println("constractor called!!");
        this.name = name;
        this.rollno = rollno;
    }
   

    public void printInformation() {
        System.out.println(name + "," + rollno + "," + collegeName);
    }

    public static void printSpecificObjectInformation(Student obj) {
        System.out.println(obj.name + "," + obj.rollno + "," + collegeName);
    }
}


class OuterClass {
	public static String name = "Joy Saha";
	public int age = 23;
	
	
	public static class StaticInnerClass {
		public void printMessage() {
			System.out.println("Static Inner Class Message: " + name);
		}
	}
	
	public class InnerClass {
		public void printMessage() {
			System.out.println("Non-Static Inner Class Message: " + name + "," + age);
		}
	}
}

public class Main {
    public static void main(String[] args) throws ClassNotFoundException {
    	Class.forName("Student"); // loading the class
    	
        Student s1 = new Student("Joy", 5);
        Student s2 = new Student("Achal", 10);
        
        // s2.collegeName = "Techno Saltlake";
        Student.collegeName = "Techno Saltlake";

        //s1.printInformation();
        //s2.printInformation();
        
        Student.printSpecificObjectInformation(s1);
        Student.printSpecificObjectInformation(s2);
    	
    	
    	OuterClass.StaticInnerClass sobj = new OuterClass.StaticInnerClass();
    	sobj.printMessage();
    	
    	
    	// non-static object creation
    	OuterClass outer = new OuterClass();
    	OuterClass.InnerClass inner = outer.new InnerClass();
    	inner.printMessage();
    	
    	// or
    	OuterClass.InnerClass innerObj = new OuterClass().new InnerClass();
    	innerObj.printMessage();

    }
}
