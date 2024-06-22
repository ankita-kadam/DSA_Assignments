
public class Stack {
	private int arr[];
	private final int SIZE;
	private int top;
	int largest=Integer.MIN_VALUE;
	
	public Stack(int size){
		top = -1;
		SIZE = size;
		arr = new int[size];
	}
	
	public void push(int value) {
		
		if(largest<value)
		{
			largest =value;
		}
		
		top++;
		arr[top] = value;
	}
	
	public int pop() {
		return arr[top--];
	}
	
	public int peek() {
		return arr[top];
	}
	
	public boolean isEmpty() {
		return top==-1;
	}
	
	public boolean isFull() {
		return top==SIZE-1;
	}
}
