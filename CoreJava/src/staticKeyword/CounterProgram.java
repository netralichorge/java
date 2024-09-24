package staticKeyword;

class Counter
{
	static int count = 0;
	int i=0;
	Counter()
	{
		count++;
		System.out.println(count);
	}
	
}
public class CounterProgram 
{
	
	public static void main(String[] args) 
	{
		for(int i=1;i<=100;i++)
		{
			new Counter();
		}
		
	}

}
