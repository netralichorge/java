package patterns;

public class Pattern3 {
	public static void main(String[] args) {
		
		for(int k=1;k<=10;k++)
		{
			int n=10;
			for(int i=1;i<=n;i++)
			{
				for(int j=1;j<=n;j++)
				{
					if(i==1||j==1||i==2||j==2||i==n||j==n||i==(n-1)||j==(n-1))
					{
						System.out.print("* ");
					}
					else
					{
						System.out.print("  ");
					}
				}
				
				System.out.println();
			}
			
			System.out.println();
		}
		
	}

}


