import java.util.Scanner;
class Program4
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter value a:");
		int a=sc.nextInt();
		
		System.out.println("Enter value b:");
		int b=sc.nextInt();
		 
		System.out.println("1:add  2:sub  3:mul  4:div");
		System.out.println("Enter option");
		int n=sc.nextInt();
		
		if(n==1)
		{
			System.out.println("Addition is "+(a+b));
		}
		else if(n==2)
		{
			System.out.println("Substraction is "+(a-b));
		}
		else if(n==3)
		{
			System.out.println("Multiplication is "+(a*b));
		}
		else if(n==4)
		{
			System.out.println("Division is "+(a/b));
		}
		else
		{
			System.out.println("Invalid Input");
		}
	
	}
}