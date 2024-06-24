
public class QueueUsingLinkedList01 {
	
	static class Node{
		int data;
		Node next;
		Node(int data){
			this.data =data;
			this.next=null;
		}
	}
	
	static class Queue{
		static Node head =null;
		static Node tail =null;
		
		public static boolean isEmpty() {
			return head == null && tail==null;
		}
		
		public static void add(int data) {
			Node newNode = new Node(data);
			if(head == null ) {
				head = tail = newNode;
				return;
			}
			tail.next=newNode;
			tail = newNode;
		}
		
		public static int remove() {
			if(isEmpty()) {
				System.out.println("Empty queue");
				return -1;
			}
			
			int front=head.data;
			
			//single element
			if(tail==head)
			{
				tail =head =null;
			}else {
				head= head.next;
			}
			return front;
		}
		
		
		
		public static void push(int data) {
			Node newNode = new Node(data);
			if(head == null) {
				head = tail = newNode;
			}else {
				tail.next=newNode;
				tail =newNode;
			}
		}
		
		public static int pop() {
			if(isEmpty()) {
				System.out.println("Queue is empty");
				return -1;
			}else {
				int front =head.data;
				if(head==tail)
				{
					head=tail=null;
				}else {
					head=head.next;
				}
				return front;
				
			}
		}
		
		public static int peek() {
			if(isEmpty()) {
				System.out.println("Queue is empty");
			}
			return head.data;
		}
	}
	
	
	public static void main(String[] args) {
		Queue q = new Queue();
		q.add(22);
		q.add(33);
		q.add(44);
		q.add(55);
		
		q.remove();
		
		System.out.println(q.peek());
		
//		while(!q.isEmpty())
//		{
//			System.out.println(q.peek());
//			q.pop();
//		}
	}

}
