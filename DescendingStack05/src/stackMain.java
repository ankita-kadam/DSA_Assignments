import java.util.Scanner;

public class stackMain {
	
	public static void main(String[] args) {
		Stack stk = new Stack(4);
		int choice;
		
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("0.Exit\n1.Push\n2.Pop\n3.Peek");
			System.out.println("Enter your choice :");
			choice =sc.nextInt();
			
			switch(choice) {
			case 1:
				if(stk.isFull())
				{
					System.out.println("Stack is full");
				}else
				{
					System.out.println("Enter data to be inserted:");
					int value=sc.nextInt();
					stk.push(value);
					System.out.println("Pushed data is :"+value);
				}
				break;
			case 2:
				if(stk.isEmpty()) 
				{
					System.out.println("Stack is empty");
				}
				else 
				{
					System.out.println("Popped data is:"+stk.pop());
				}
				break;
			case 3:
				if(stk.isEmpty()) {
					System.out.println("Stack is empty");
				}
				else {
					System.out.println("Peeked element:"+stk.peek());
				}
				break;
			default:
				System.out.println("Invalid choice !!");
				break;
			}
		}while(choice!=0);
		
	}

}
