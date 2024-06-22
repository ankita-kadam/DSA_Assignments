import java.util.Scanner;

// Insert 5 elements in stack and find maximum value in stack without traversing it
public class StackMain 
{
	public static void main(String[] args) {
		
		Stack stk = new Stack(5);
		
		stk.push(22);
		stk.push(11);
		stk.push(99);
		stk.push(55);
		stk.push(66);
		
		System.out.println("Maximum value in stack is:"+ stk.largest);
		
	}
	
	

}
