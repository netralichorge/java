import java.util.Scanner;
class length_Count
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String weekdays[]={"mon","tue","wed","thur","fri","sat","sun"};
		
		int primeNumbers[]={11,13,17,5};
		
		System.out.println("weekdays :"+weekdays.length);
		System.out.println("primeNumbers :"+primeNumbers.length);
		
		//Enhanced for loop
		
		for(String day:weekdays)
		{
			System.out.println(day);
		}
		
		for(int numbers:primeNumbers)
		{
			System.out.println(numbers);
		}
		
	}
}
