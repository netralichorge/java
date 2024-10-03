package abstraction;

abstract class Electronics
{
	abstract void start();
	abstract void stop();			// method without implimentation is called abstaction.
}

class TV extends Electronics
{
	void start()
	{
		System.out.println("TV started");
	}
	
	void stop()
	{
		System.out.println("TV turned off");
	}
}

class AC extends Electronics
{
	void start()
	{
		System.out.println("AC started");
	}
	
	void stop()
	{
		System.out.println("Ac turned off");
	}

}

public class AbstractionExample1 {
	
	public static void main(String[] args) {
		
		new TV().start();
		new AC().start();
		
		new TV().stop();
		new AC().stop();
		
		
		Electronics washingMachine = new Electronics()
		{
			void start()
			{
				System.out.println("Start washing machine ");
			}
			
			void stop()
			{
				System.out.println("Stop Washing machine");
			}
			
		};
		
		washingMachine.start();
		washingMachine.stop();
		
		
		
		
		
		
		
		
	}

}
