package abstraction;

public class ExampleInterface2 {

	public static void main(String[] args) {
		
		R r = new R();
		r.add(10,52);
		r.sub(20,10);
		
		int ans = r.square(5);
		
		System.out.println(ans);

	}

}
