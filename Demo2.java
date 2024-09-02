class Demo2
{
	public static void main(String args[])
	{
		// Relational operator
		int n=7;
		int m=10;
		
		System.out.println(n>=m);
		
		int a=34;
		int b=100;
		
		System.out.println(a<=b);
		
		int p=120;
		int q=120;
		
		System.out.println(p!=q);
		
		//Logical operator
		int s=8;
		
		System.out.println(s!=8 && s<=10);
		
		int t=9;
		System.out.println(t%2==0 || t%9==0);
		
		int c=10;
		System.out.println(!(c%10==0));
		
		//Bitwise operator
		
	    // Bitwise and (&) If all bits are 1 then it gives one
		
		// Bitwise or (|) 
		/* If either of bit is one then you will get one 
		   If all bits are zero then you will get zero
		  */
		
		// Bitwise xor(^)
		/* If bits are different then you will get 1
		   If bits are same then you will get 0
		  */
		  
		// Bitwise not(~)
		/* If bit is 1 then you will get 0 and if bit id 0 then you will return 1
		   Compiler will return 2's complement of a number 
		   */

		System.out.println(20&6);
		System.out.println(20|6);
		System.out.println(15^6);
		System.out.println(~6);
	}
}

