package stack;

public class StackUsingLinkedList<T> {
	 private Node<T> head;
	 private int size;
	 public StackUsingLinkedList() {
		 head=null;
		 size=0;
	 }
	 
	 
	// Return the size of the stack
	
	 int size() {
		return size;
		 
	 }
	 
	 //return top element of the stack
	 
	 T top() {
		 return  head.data;
	 }
	 
	 //check Empty OR NotEmpty
	 
	boolean isEmpty() {
		return (size==0);
	} 
	
	//push operation
	 
	public void push(T element) {
		Node<T> newNode=new Node<T>(element);
		if(size==0) {
			head=newNode;
			size+=1;
		}
		else {
			newNode.next=head;
			head=newNode;
			size+=1;
		}
		
	}
	//POP operation 
	
	public T pop() {
		
		T res=head.data;
		head=head.next;
		size-=1;
		return res;
	}
}

	

