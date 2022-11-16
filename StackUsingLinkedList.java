package stack;

public class StackUsingLinkedList<T> {
	 private Node<T> head;
	 private int size;
	 public StackUsingLinkedList() {
		 head=null;
		 size=0;
	 }
	 
	 int size() {
		return size;
		 
	 }
	 T top() {
		 return  head.data;
	 }
	boolean isEmpty() {
		return (size==0);
	}
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
	}public T pop() {
		
		T res=head.data;
		head=head.next;
		size-=1;
		return res;
	}
}

	

