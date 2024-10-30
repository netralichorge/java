package multithreading;

class P extends Thread
{
	public void run()
	{
		for(int i=1; i<=5; i++)
		{
			System.out.println("*");
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

class Q extends Thread
{
	public void run()
	{
		for(int i=1; i<=5; i++)
		{
			System.out.println("#");
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

public class Example2 {

	public static void main(String[] args) throws InterruptedException {
		
		P p1 = new P();
		p1.start();
		p1.join();
		
		Q q1 = new Q();
		q1.start();
		q1.join();
		
		System.out.println("Main method");

	}

}
