class Program3
{
	public static void main(String args[])
	{
		if(true && false)
		{
			System.out.println("A");
			
			if(true && true && false)
			{
				System.out.println("C");
			}
		}
		
		else
		{
			if(true || false)
			{
			System.out.println("B");
			}
			else
			{
				System.out.println("D");
			}
		}
	}
}