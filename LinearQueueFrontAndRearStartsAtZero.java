package com.sunbeam;

public class LinearQueueFrontAndRearStartsAtZero {

	static class Queue{
		static int arr[];
		static int rear;
		static int front;
		static int SIZE;
		
		Queue(int size){
			arr = new int[size];
			front=rear=0;
			SIZE=size;
		}
		
		public static boolean isEmpty() {
			return front==rear;
		}
		
		public static boolean isFull() {
			return rear == SIZE;
		}
		
		public void enqueue(int value) {
			if(isFull())
				System.out.println("Queue is full");
			else
			arr[++rear]=value;
		}
		
		public int dequeue() {
			
			if(isEmpty())
				System.out.println("Queue is empty");

			int front = arr[1];
			for(int i=1;i<rear;i++)
			{
				arr[i]=arr[i+1];
			}
			--rear;
			return front;
		}
		
		public static int peek() {
			if(isEmpty())
			{
				System.out.println("Queue is empty");
				return -1;
			}
			return arr[rear]
		}
	}
	
	
	public static void main(String[] args) 
	{
		Queue q = new Queue(6);
		
		q.enqueue(11);
		q.enqueue(22);
		q.enqueue(33);
		q.enqueue(44);
		q.enqueue(55);

		while(!q.isEmpty()) {
			System.out.println(q.peek());
			q.dequeue();
		}
		q.peek();
	}

}
