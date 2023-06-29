class Num {
	private int num;
	private boolean isNumSet = false; 
	
	public synchronized void set(int num) {
		if(isNumSet) { // if number is already set, wait for the getting the value
			try { wait(); }catch(Exception e) {System.out.println(e.getMessage());}
		}
		
		System.out.println("Set: " + num);
		this.num = num;
		isNumSet = true;
		
		notify(); // it will notify the consumer thread that I'm done with setting up the value.
	}
	
	public synchronized void get() {
		if(!isNumSet) { // wait for setting up the value first
			try { wait(); }catch(Exception e) {System.out.println(e.getMessage());}
		}
		System.out.println("Get: " + num);
		isNumSet = false;
		
		notify(); // it will notify the producer thread that I'm done with getting the value.
	}
}

class Producer implements Runnable {
	private Num num;
	
	public Producer(Num num) {
		this.num = num;
		
		Thread t = new Thread(this, "Producer");
		t.start();
	}
	
	@Override
	public void run() {
		int i = 0;
		while(true) {
			num.set(i++);
			try {Thread.sleep(100);}catch(Exception e) {System.out.println(e.getMessage());}
		}
	}	
}


class Consumer implements Runnable {
	private Num num;
	
	public Consumer(Num num) {
		this.num = num;
		
		Thread t = new Thread(this, "Consumer");
		t.start();
	}
	
	@Override
	public void run() {
		while(true) {
			num.get();
			try {Thread.sleep(5000);}catch(Exception e) {System.out.println(e.getMessage());}
		}
	}	
}


public class Main {

	public static void main(String[] args) {
		Num num = new Num();
		new Producer(num);
		new Consumer(num);
	}
}
