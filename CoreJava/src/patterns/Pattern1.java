package patterns;

public class Pattern1 {
	
	public static void main(String[] args) {
		
		for(int j=1;j<=7;j++) //outer for loop denotes the number of coloumns
		{
			
			for(int i=1;i<=10;i++) //Inner for loop denotes the number of rows
			{
				System.out.print("*");
			}
			
			System.out.println();
		}
	
}

}
