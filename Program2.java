import java.util.Scanner;
class Program2
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter name:");
		String name=sc.next() ;
		
		System.out.println("Enter age:");
		int n=sc.nextInt();
		
		System.out.println("My name is "+name+" and My age is "+n);
	}
}