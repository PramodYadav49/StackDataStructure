package stack;

public class StackUse {

	public static void main(String[] args) throws StackfullException, StackEmptyException {
		// TODO Auto-generated method stub
		StackusingArray stack1=new StackusingArray(3);
		stack1.push(10);
		stack1.push(58);
		stack1.push(3);
		stack1.push(8);
		stack1.push(9);
		stack1.push(20);
		stack1.push(10);
		stack1.push(58);
		stack1.push(3);
		stack1.push(8);
		stack1.push(9);
		stack1.push(20);
		stack1.push(10);
		stack1.push(58);
		stack1.push(3);
		stack1.push(8);
		stack1.push(9);
		stack1.push(20);
		System.out.println(stack1.size());
		System.out.println(stack1.top());
		System.out.println(stack1.pop());
		System.out.println(stack1.isEmpty());
		System.out.println(stack1.size());
		
		
	}

}
