class Demo18
{
	public static void main(String args[])
	{
		
		//nested for loop
		int arr1[][]={{12,45,87},{67,49,23}};
		
		for(int i=0;i<arr1.length;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.println(arr1[i][j]);
			}
		}
		
		System.out.println("==========================");
		//Enhance for loop
		// Enhance loop only used for an array
		// it does not contain increment, condition.
		
		for(int n[]:arr1)
		{
			for(int i:n)
			{
				System.out.println(i);
			}
		}
		
		System.out.println("=========================");
		int arr2[][]={{12,45},{67,98,47},{23,90,87,68}};
		
		for(int n[]:arr2)
		{
			System.out.println(n.length);
			
		}	
		
	}
}