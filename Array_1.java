import java.util.Scanner;
class Sum
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int numbers[]={1,4,6,2,45};
		int sum=0;
		
		for(int n:numbers)
		{
			
			sum+=n;
		}
		
		System.out.println("Sum is "+sum);
		
		//----------------------------------------------------------------
		//count characters in array
		System.out.println("========================");
		
		
		char ch[]={'a','e','i','a','c','a'};
		int count=0;
		
		for(char c:ch)
		{
			if(c=='a')
				count++;
			
		}
		System.out.println(count);
		
		//--------------------------------
		//count vowels and consonants
		
		char cha[]={'a','e','t','i'};
		int vowels=0;
		int consonants=0;
		
		for(char c:cha)
		{
			if(c=='a' ||c=='e' || c=='i' ||c=='o' || c=='u')
				vowels++;
			
			else
				consonants++;
		}
		System.out.println("Vowels: "+vowels);
		System.out.println("Consonants: "+consonants);
		
		
	}

}