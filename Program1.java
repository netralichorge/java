import java.util.Scanner;
class Program
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter the length and bredth of rectangle:");
		int l=s.nextInt();
		int b=s.nextInt();
		
		System.out.println("Area of rectangle is "+(l*b));
	}
}