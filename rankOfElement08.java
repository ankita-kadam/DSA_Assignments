package com.sunbeam;
/* to find rank of an element in a stream of integers. rank: rank of a given integer "x", in stream is "total
 no. of ele's less than or equal to x (including x)*/
import java.util.Scanner;

public class rankOfElement08 {

	public static int rankOfElement(int arr[],int element) 
	{
		int count=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<=element)
			{
				count++;
			}
			
		}
		
		return count;
	}
	
	public static void main(String[] args) {
		int arr[]= { 10, 20, 15, 3, 4, 4, 1 };
//		int element;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter element: ");
		System.out.println("Rank of element in stream of integers:"+rankOfElement(arr,sc.nextInt()));
		sc.close();
	}

}
