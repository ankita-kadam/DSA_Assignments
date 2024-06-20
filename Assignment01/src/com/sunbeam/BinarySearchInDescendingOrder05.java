package com.sunbeam;
//
import java.util.Scanner;

public class BinarySearchInDescendingOrder05 {

	public static int binarySearch(int arr[],int key) {
		int left =0, right=arr.length-1;
		while(left<=right) 
		{
			int mid=(left+right)/2;
			if(key==arr[mid])
				return mid;
			else if(key>arr[mid])
				right=mid-1;
			else
				left=mid+1;
		}
		return -1;
	}
	
	public static void main(String[] args) 
	{	
		int arr[]= {99,88,77,66,55,44,33,22,11};
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter key to be searched: ");
		int key = sc.nextInt();
		
		int index = binarySearch(arr, key);
		if(index!=-1)
		{
			System.out.println("Key found at index:"+index);
		}else {
			System.out.println("Key not found");
		}	
	}

}
