package stack;



public class StackusingArray {
	private int data[];
	private int top;
public StackusingArray() {
	data=new int[10];
	top=-1;
}
public StackusingArray(int arrLength) {
	data=new int[arrLength];
	top=-1;
}
public boolean isEmpty() {
	return (top==-1);
}
public int top() throws StackEmptyException {
	if(top==-1) {
		StackEmptyException e=new StackEmptyException();
		throw e;
	}
	return data[top];
	
}
public int size() {
	return top+1;
}
public void push(int d) throws StackfullException {
	if(top==data.length-1) {
//		  StackfullException e=new StackfullException();
//		  throw e;
		DoubleCapacity();
	}
	top+=1;
	data[top]=d;
}
public void DoubleCapacity() {
	int temp[]=data;
	data=new int[2*top];
	for(int i=0;i<=top;i++) {
		data[i]=temp[i];
	}
	
}
public int pop() throws StackEmptyException {
	if(top==-1) {
		StackEmptyException e=new StackEmptyException();
		throw e;
	}
	int d=data[top];
	top-=1;
	return d;
	
}


}
