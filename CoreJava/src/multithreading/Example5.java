package multithreading;

public class Example5 {

	public static void main(String[] args) {
		
		Runnable r1 = ()->System.out.println("MultiThreading with lambda");
		Thread t1 = new Thread(r1);
		t1.start();
		
		
		System.out.println("-----------------------------------------");
		
		Thread t2 = new Thread(()->System.out.println("lambda"));
		t2.start();
	}

}
