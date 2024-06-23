import java.util.Stack;

public class ReversedLinearLinkedList03 {

	public class Node{
		int data;
		Node next;
		
		public Node(int data) {
			this.data=data;
			this.next=next;
		}
	}
	public static Node head;
	public static Node tail;
	
	public void addFirst(int data) {
		
		Node newNode = new Node(data);
		
		if(head == null) {
			head = tail = newNode;
		}
		
		newNode.next=head;
		head =newNode;
	}
	
	public void addLast(int data) {
		Node newNode = new Node(data);
		
		if(head == null) {
			head = tail = newNode;
		}
		
		tail.next= newNode;
		tail =newNode;
		
	}
	
	public void print() {
		Node temp= head;
		
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
		
		System.out.println();
	}
	public void displayReversedUsingStack() {
		//Time Complexity = O(2N) = O(N)
		//Space Complexity = O(N)
		
		Stack<Node> stack = new Stack<>();
		
		Node temp = head;
		
		while(temp!=null) {
			stack.push(temp);
			temp = temp.next;
		}
		while(!stack.isEmpty()) {
			System.out.print(stack.pop().data+" ");
		}
	}
	
	 public void ReversedLLUsingRecursiveApproach() {
		//Time Complexity=O(N)
		//Space Complexity=O(1)
		 Node temp= head;
		 Node prev = null;
		 Node front;
		 
		 while(temp!=null) {
			 //Store next node 
			 front =temp.next;
			 //connect current var backward
			 temp.next=prev; 
			 prev = temp;
			 temp=front;
		 }
		 head =prev;
	 }
	
	public static void main(String[] args) {
		ReversedLinearLinkedList03 ll = new ReversedLinearLinkedList03();
		ll.addFirst(11);
		ll.addLast(55);
		ll.addFirst(22);
		ll.addFirst(33);
		ll.addLast(66);
		ll.print();
		
		ll.displayReversedUsingStack();
		System.out.println();
		
		ll.ReversedLLUsingRecursiveApproach();
		ll.print();
	}

}
