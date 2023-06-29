// NOTES: 
// 1. We can extend Thread class but if we want to inherit of another class, we can't do here normally, then
// 		we have to use Runnable functional interface for multi-threading.
// 2. Mutation is changing the state of an object, either the list or some custom object.

class A extends Thread {
	public void show() {
		for(int i = 0; i < 100; i++) {
			System.out.println("Hello");
			try { Thread.sleep(10); }catch(Exception e){  System.out.println(e.getMessage()); }
		}
	}
	
	@Override
	public void run() {
		show();
	}
}

class B extends Thread {
	public void show() {
		for(int i = 0; i < 100; i++) {
			System.out.println("Hi");
			try { Thread.sleep(10); }catch(Exception e){  System.out.println(e.getMessage()); }
		}
	}
	
	@Override
	public void run() {
		show();
	}
}

// using Runnable functional interface
class C extends B implements Runnable{
	public Counter c;
	public C(Counter c) {
		this.c = c;
	}
	
	public void show() {
		for(int i = 0; i < 10000; i++) {
			c.increament();
		}
	}
	
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
		show();
	}
}

class D implements Runnable {
	public Counter c;
	public D(Counter c) {
		this.c = c;
	}
	
	public void show() {
		for(int i = 0; i < 10000; i++) {
			c.increament();
		}
	}
	
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
		show();
	}
}


class Counter {
	int counter;
	//synchronized keyword makes sure that only one thread can access the resource at a given point in time.
	public synchronized void increament() { 
		counter++;
	}
}


public class Main {

	public static void main(String[] args) {
		// using Thread class
		//A obj1 = new A();
		//B obj2 = new B();
		
		//obj1.show();
		//obj2.show();
		
		//obj1.start();
		//obj2.start();
		
		Counter c = new Counter();
		
		// using Runnable functional interface
		Runnable obj1 = new C(c);
		Runnable obj2 = new D(c);
		
		Thread t1 = new Thread(obj1); // it takes reference of Runnable interface.
		Thread t2 = new Thread(obj2);
		
		t2.setPriority(Thread.MAX_PRIORITY);
		
		t1.start();
		t2.start();
		
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println(c.counter);
		//System.out.println(c.counter);
		
		System.out.println(Thread.currentThread().getName());
	}
}
