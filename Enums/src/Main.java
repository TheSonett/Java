// NOTES:
// 1. values() returns an array of all enum constants, 
// 2. valueOf(String name) returns the enum constant with the specified name
// 3. ordinal() returns the position/index of the enum constant.
// 4. 

enum Laptop {
	MACBOOK(2000), XPS(2200), SURFACE, THINKPAD(1800); // this are objects
	
	private int price;
	
	// access modifiers are not allowed here except private only for constructors.
	private Laptop() {
		System.out.println("Enum default constructor called!!");
		this.price = 1000;
	}
	
	private Laptop(int price) {
		System.out.println("Enum parameteried constructor called!!");
		this.price = price;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
}


public class Main {
	
	public static void main(String[] args) {
		Laptop lp = Laptop.MACBOOK;
		System.out.println(lp.getPrice());
		
		for(Laptop l : Laptop.values()) {
			System.out.println(l + " : " + l.getPrice());
		}
		
		lp.setPrice(5040);
		System.out.println(lp.getPrice());
	}

}
