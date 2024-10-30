package multithreading;

class T3 extends Thread
{
	public void run()
	{
		while(true)
		{
			System.out.println("*********");
		}
	}
}

public class Example3 {

	public static void main(String[] args) throws InterruptedException {
		
		T3 thread = new T3();
		thread.setDaemon(true);
		thread.start();
		
		Thread.sleep(50000);
		
		

	}

}
