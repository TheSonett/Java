
@FunctionalInterface // can only have one abstract method
interface A {
	public abstract void show();
}

@FunctionalInterface // can only have one abstract method
interface Calc {
	public abstract int add(int i, int j);
}


public class Main {

	public static void main(String[] args) {
		// regular expression
		A obj = new A() {
			@Override
			public void show() {
				System.out.println("In show called!!");
			}
		};
		
		// or using lambda expression 
		A obj2 = () -> System.out.println("In show called!!");
		
		obj.show();
		obj2.show();
		
		
		Calc obj3 = (i, j) -> i + j;
		System.out.println(obj3.add(4, 2));

	}

}
