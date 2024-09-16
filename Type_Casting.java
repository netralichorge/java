class Type_Casting
{
	public static void main(String args[])
	{
		// Widening Typecasting
		
		int a=10;
		long b=a;
		
		System.out.println(b);
	
	// Narrowing TypeCasting
	
		int c=100;
		byte d=(byte) c; // int to byte conversion
	
		System.out.println(d);
		System.out.println("=========================================");
		
		int n=66;
		char ch=(char) n; // int to char
		System.out.println(ch);
		System.out.println((char)n);
		
		
	}
}