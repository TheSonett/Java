
public class Main {

	public static void main(String[] args) {
		Student s1 = new Student("Sonett", 10, "SurTech");
		Student s2 = new Student("Sonett", 10, "Techno");
		//s1.setAge(10);
		//s1.setName("Joy");
		
		System.out.println(s1.getCurrentObjectReference());
		System.out.println(s2.getCurrentObjectReference());
		
		System.out.println(s1.getAgeByThis());
		System.out.println(s1.getNameByThis());
		
		
		System.out.println(s1 == s2); // false and we cannot do operator overloading in java
		System.out.println(s1.equals(s2)); // false but we can make it true.
	}
}
