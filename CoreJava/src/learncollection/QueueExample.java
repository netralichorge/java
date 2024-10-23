package learncollection;

import java.util.PriorityQueue;

public class QueueExample {

	public static void main(String[] args) {
		
		System.err.println("Hello");  // err helps to print output in red colour
		
		// PriorityQueue
		
		PriorityQueue<Integer> numbers = new PriorityQueue<Integer>((i1,i2)->i2-i1);
		
		for(int i=1; i<=20; i++)
		{
			numbers.add(i);
		}
		
		System.out.println(numbers);
		
		System.out.println("---------------------");
		
		// poll helps to remove first element
		
		System.out.println(numbers.poll());
		System.out.println(numbers);

	}

}
