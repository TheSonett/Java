// NOTES:
// 1. A list can have duplicate values.
// 2. ArrayList is a class which implements a List interface, and the interface extends Collection interface

import java.util.*;

public class ArrayListClass {

	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(23);
		arr.add(12);
		arr.add(30);
		arr.add(7);
		arr.add(56);
		arr.add(12);
		
		for(int i = 0; i < arr.size(); i++) {
			System.out.print(arr.get(i) + " ");
		}
		System.out.println();
		
		arr.remove(3);
		
		for(int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		arr.add(3, 66);
		
		arr.forEach(n -> System.out.print(n + " "));
		System.out.println();
		
		ArrayList<Integer> arr2 = arr; // shallow copy
		Iterator<Integer> it = arr2.iterator();
		
		while(it.hasNext()) {
			System.out.print(it.next() + " ");
		}
		
		System.out.println("\nAfter deleting index 1 element -> ");
		arr.remove(1);
		
		for(int i : arr2) {
			System.out.print(i + " ");
		}
	}

}
