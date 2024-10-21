package learncollection;

import java.util.Stack;

public class ListExample9 {

	public static void main(String[] args) {
		
		Stack<Integer> stack = new Stack<Integer>();
		
		stack.push(18); // push method use for add elements in stack
		stack.push(67);
		stack.push(88);
		
		System.out.println(stack);
		
		System.out.println(stack.search(67)); // search method display index of element
		
		System.out.println("---------------------");
		
		System.out.println(stack.pop());  //pop method used for remove last element added in stack
		System.out.println(stack);
		
		System.out.println(stack.peek()); // to see last added element
		System.out.println(stack);
		
		System.out.println(stack.empty()); // empty method returns boolean value

		
	}

}
