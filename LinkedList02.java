
public class LinkedList02 {

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
			 head=tail=newNode ;
			 return;
		}
		newNode.next =head;
		head =newNode;
		
	}
	
	public void addLast(int data) {
		Node newNode = new Node(data);
		
		if(head == null) {
			head =tail=newNode;
		}
		
		tail.next=newNode;
		tail=newNode;
		
	}
	
	public void printList() {
		Node temp=head;
		
		while(temp!=null) 
		{	
			System.out.print(temp.data + " ");
			temp=temp.next;	
		}
	}
	
	public static void main(String[] args) {
		LinkedList02 ll = new LinkedList02();
		ll.addFirst(11);
		ll.addLast(55);
		ll.addFirst(22);
		ll.addFirst(33);
		ll.addLast(66);
		
		ll.printList();

	}

}
