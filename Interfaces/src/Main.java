interface X extends Car {
	public void run();
}

interface Y extends Car {
	public void run();
}


class BMW implements X, Y {

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("Show function called!!");
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
	
}

public class Main {
	public static void main(String[] args) {
		Car obj = new Car() { // anonymous inner class possible in interface
			@Override
			public void show() {System.out.println("show() function called!!");}
			@Override
			public void print() {System.out.println("print() function called!!");}
		};
		
		obj.show();
		
		// static inner class
		Car.Me obj2 = new Car.Me();
		obj2.show();
		
		// non-static inner class
		Car.Me2 obj3 = new Car.Me2(); // IMPT:: allowed to access like that only for interfaces
		obj3.show();
		
		Car obj4 = new BMW();
		obj4.show();
	}
}
