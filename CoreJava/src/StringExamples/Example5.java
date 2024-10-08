package StringExamples;

public class Example5 {
	
	public static void main(String[] args) {
		
		String s1 = "Mobile";
		
		for(int i=(s1.length()-1); i >= 0; i--)
		{
			System.out.print(s1.charAt(i));
			
		}
		
		System.out.println("-------------------------");
		
		int count =0;
		for(char ch : s1.toCharArray())
		{
			if(ch=='o' || ch=='O')
				count++;
		}
		
		System.out.println(count);
		
		
	}

}
