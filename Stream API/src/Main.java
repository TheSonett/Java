// NOTES:
// 1. A stream is not a data structure.
// 2. Streams don’t change the original data structure, they only provide the result as per the pipelined methods.
// 3. map() is used to apply some operations to each element and returns a stream.
// 4. filter() is used to take a function & select elements as per the Predicate passed as an argument.
// 5. reduce() is used to reduce the elements of a stream to a single value. The reduce method takes a 
// 		BinaryOperator as a parameter.
// 6. A particular stream can be used only once.

import java.util.*;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(1, 2, 8, 4, 10); // 4 + 16 + 8 + 20 = 48
		
		Stream<Integer> s1 = nums.stream();
		Stream<Integer> s2 = s1.filter(n -> n % 2 == 0); // take out the even numbers
		Stream<Integer> s3 = s2.map(n -> n * 2); // double every even numbers
		int result = s3.reduce(0, (c, e) -> c + e); // add up every number
		
		
		Consumer<Integer> com = new Consumer<Integer>() {
			@Override
			public void accept(Integer n) {
				System.out.print(n + " ");
			}
		};
		
		nums.forEach(com);
		System.out.println("\n" + result);

	}

}
