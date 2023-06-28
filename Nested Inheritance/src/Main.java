
class Student {
	private String name;
	private int rollno;
	
	public Student() {System.out.println("Student constructor called!!"); }
	
	public Student(String name, int rollno) {
		this.name = name;
		this.rollno = rollno;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	
	// This is called Nested Inheritance which is a bad practice. so not recommended!!
	// non-static inner class -> does keep a reference to the outer-class.
	public class Me extends Student {
		Me() {System.out.println("Me constructor called!!");}
	}
	
	// static inner class ->  does not keep reference to the outer-class.
	public static class Me2 extends Student {
		Me2() {System.out.println("Me2 constructor called!!");}
	}
}




public class Main {

	public static void main(String[] args) {
		Student sobj = new Student("Joy", 5);
		System.out.println(sobj.getName());
		System.out.println(sobj.getRollno());
		
		Student.Me obj = sobj.new Me();
		obj.setName("Sonett");
		obj.setRollno(10);
		System.out.println(obj.getName());
		System.out.println(obj.getRollno());
		
		
		Student.Me2 obj2 = new Student.Me2();
		System.out.println(obj2.getName());
		System.out.println(obj2.getRollno());
		
		// Only possible when Inner extends Outer:
		Student.Me c = sobj.new Me().new Me();
		System.out.println(c);

	}

}
