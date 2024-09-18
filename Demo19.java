class Demo19
{
	public static void main(String args[])
	{
		String courses[][]={
			{"HTML","CSS","JavaScript"},
			{"MySql","MongoDB"},
		    {"Core java","Spring Boot"}};
			
			int total_courses=0;
			for (String course[]:courses)
				
			{
				total_courses+=course.length;
				for(String c_name:course)
				{
					System.out.println(c_name);
				}
			}
			
			System.out.println("Total courses:"+total_courses);
				
	}
}