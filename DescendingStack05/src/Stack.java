
public class Stack {
	private int arr[];
	private int top;
	private final int SIZE;
	
	public Stack(int size)
	{	
		SIZE=size;
		arr= new int[SIZE];
		top=size;
	}
	
	public void push(int value) {
		arr[--top]=value;
	}
	
	public int pop() {
		return arr[top--];
	}
	
	public int peek() {
		return arr[top];
	}
	
	public boolean isEmpty() {
		return top==SIZE;
	}
	
	public boolean isFull() {
		return top==-1;
	}
}
