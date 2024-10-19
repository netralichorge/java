package revision;

interface I1
{
	void display();
}
@FunctionalInterface
interface I2
{
	void apply();
}

public class Example1 {

	public static void main(String[] args) {
		
		I1 a = new I1() {
			
			public void display()
			{
				System.out.println("Dispaly method from I1");
			}
		};
		
		a.display();
		
		//Annonemous inner class
		
		I2 i = new I2() {
			
			public void apply()
			{
				System.out.println("Apply method from I2");
			}
		};
		i.apply();
		
		// Create Lambda for I2 interface
		
		I2 j=()->System.out.println("Apply method from I2(Lambda)");
		j.apply();
		
		

	}

}
