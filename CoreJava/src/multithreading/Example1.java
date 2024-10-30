package multithreading;

// create a class
// inherit the thread class

class T1 extends Thread
{
	public void run()
	{
		for(int i=1; i<=10; i++)
		{
			System.out.println("Hello");
			try {
				Thread.sleep(1000);
			} 
			catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

class T2 extends Thread
{
	public void run()
	{
		for(int i=1; i<=10; i++)
		{
			System.out.println("Bye");
			try {
				Thread.sleep(500);
			} 
			catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

public class Example1 {

	public static void main(String[] args) throws InterruptedException {
		
		T1 t1 = new T1();
		t1.start();
		t1.join();
		
		T2 t2 = new T2();
		t2.start();
		t2.join();
		
		System.out.println("Main Method");
		
	}

}
