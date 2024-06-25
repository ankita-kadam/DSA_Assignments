package com.sunbeam;

//Write program to implement linear queue in which front and rear starts at 0

public class CircularQueueUsingCounterMethod08 {

	static class Queue{
		static int arr[];
		static int front;
		static int rear;
		static int SIZE;
	
		Queue(int size){
			arr  = new int[size];
			SIZE= size;
			front = -1;
			rear= -1;
		}
		
		public int remove(int data) {
			if(isFull())
			{
				System.out.println("Queue is empty");
				return -1;
			} 
			int result =arr[front];
			
		}
		
		public static boolean isEmpty() {
			return rear==-1 && front==-1 ;
		}
		public static boolean isFull() {
			return (rear +1)% SIZE == front;
		}
		
		public static void add(int data) {
			
		}
		
	}
	public static void main(String[] args) {
		
	}

}
