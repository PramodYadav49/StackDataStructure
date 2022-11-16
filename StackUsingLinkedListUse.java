package stack;

public class StackUsingLinkedListUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StackUsingLinkedList<Integer> sll=new StackUsingLinkedList<Integer>();
		for(int i=0;i<20;i++) {
			sll.push(i*3);
		}
		
		System.out.println(sll.top());
		for(int i=0;i<5;i++) {
			System.out.println(sll.pop());
		}
		System.out.println(sll.size());
	}

}
