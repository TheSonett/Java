// NOTES:
// 1. Comparator is a functional interface, used to order the objects of a user-defined class.
// 2. If collection elements are of Set or Map, we can use TreeSet or TreeMap. However, we cannot sort 
// the elements of List. Collections class provides methods for sorting the elements of List type elements also.
// 3. Comparator -> If you want to specify on which logic you want to sort the element, use it.
//	  Comparable -> If you want to give power to the class itself to, compare itself which another object,
// 					use comparable there.


import java.util.*;
import java.util.stream.Stream;

class Student implements Comparable<Student> {
	public String name;
	public int rollno;
	
	public Student(String name, int rollno) {
		this.name = name;
		this.rollno = rollno;
	}

	public int compareTo(Student that) {
		if(this.rollno > that.rollno)
			return 1;
		return -1;
	}
}

public class Main {

	public static void main(String[] args) {
		Comparator<Integer> com = new Comparator<>() {
			@Override
			public int compare(Integer i, Integer j) {
				if(i%10 > j %10)
					return 1;
				
				return -1;
			}
		};
		
		
		List<Integer> nums = new ArrayList<Integer>();
		nums.add(23);
		nums.add(45);
		nums.add(12);
		nums.add(85);
		nums.add(28);
		
		Collections.sort(nums, com);
		
		for(int i : nums) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		// for user-defined classes
		List<Student> students = new ArrayList<Student>();
		students.add(new Student("Joy", 5));
		students.add(new Student("Navin", 2));
		students.add(new Student("Rahul", 9));
		students.add(new Student("Sayani", 10));
		students.add(new Student("Vivek", 1));
		
		Collections.sort(students);
		
		for(var student: students) {
			System.out.println(student.name + " : " + student.rollno);
		}
		
		Stream<Student> s = students.stream().sorted();
		s.forEach(n -> System.out.println(n.name + " -> " + n.rollno));
	}

}
