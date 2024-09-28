package patterns;

public class Pattern4 {

	public static void main(String[] args) {
		
		int n=4;
		
		for(int i=1;i<=n;i++)
		{
			
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			
			System.out.println();
		}
		
System.out.println("=================");
		
		for(int i=1;i<=n;i++)
		{
			
			for(int j=1;j<=i;j++)
			{
				System.out.print(i);
			}
			
			System.out.println();
		}

System.out.println("===============");

	for(int i=1;i<=n;i++)
	{
	
		for(int j=1;j<=i;j++)
		{
			System.out.print(j);
		}
	
		System.out.println();
	}

System.out.println("======================");
 		
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				if(i==1||i==3) //(i%2==0)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(i);
				}
				
				
			}
			System.out.println();
				
		}
		
System.out.println("===============");
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				if(i==1||i==3) //(i%2==0)
				{
					System.out.print(j);
				}
				else
				{
					System.out.print("*");
				}
		
		
			}
			System.out.println();
		
		}	
		
System.out.println("====================");
		
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{	
				if(i%2==0) 
				{
					System.out.print("0");
				}
				else
				{
					System.out.print("1");
		
				}
				
			}	
			System.out.println();
		
		}
		
		
System.out.println("==================");
		
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{	
				if((i+j)%2==0) 
				{
					System.out.print("1");
				}
				else
				{
					System.out.print("0");
		
				}
				
			}	
			System.out.println();
		
		}
	}
}

