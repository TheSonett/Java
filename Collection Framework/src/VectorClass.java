// Difference between ArrayList and Vector is that,
// 1. ArrayList is not synchronized, whereas Vector is synchronized.
// 2. ArrayList is fast but Vector is slow because it uses only one thread at a time because of multi-threading.
// 3. It's recommended to use ArrayList.


import java.util.*;

public class VectorClass {

	public static void main(String[] args) {
		Vector<Integer> arr = new Vector<Integer>();
		arr.addElement(23);
		arr.addElement(12);
		arr.addElement(30);
		arr.addElement(7);
		arr.addElement(56);
		arr.addElement(12);
		
		for(int i = 0; i < arr.size(); i++) {
			System.out.print(arr.get(i) + " ");
		}
		System.out.println();
		
		arr.removeElementAt(3);
		
		for(int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		arr.add(3, 66);
		
		arr.forEach(n -> System.out.print(n + " "));
		System.out.println();
		
		Vector<Integer> arr2 = arr; // shallow copy
		Iterator<Integer> it = arr2.iterator();
		
		while(it.hasNext()) {
			System.out.print(it.next() + " ");
		}
		
		System.out.println("\nAfter deleting index 1 element -> ");
		arr.removeElement(66);
		
		for(int i : arr2) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		// only possible in vector
		Enumeration<Integer> e = arr2.elements();
		while(e.hasMoreElements()) {
			System.out.print(e.nextElement() + " ");
		}
		
		// making an ArrayList synchronized
		ArrayList<Integer> obj = new ArrayList<>();
		List<Integer> nums = Collections.synchronizedList(obj);
		System.out.println(nums);
	}

}
