package com.sunbeam;
// Write a linear search algorithm to return index of last occurance of key
import java.util.Arrays;
import java.util.Scanner;

public class LinearSearchAlgo02 {

	public static int linearSearch(int arr[],int size,int key) {
		for(int i=size-1;i>=0;i--) {
			if(key==arr[i]) {
				return i;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		
		int arr[]= {11,22,55,55,66,77,66,11,33,11,99};
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter key to be searched: ");
		int key=sc.nextInt();

		
		int index = linearSearch(arr,arr.length,key);
		if(index!=-1) {
			System.out.println("Key is found at index :"+index);
		}else {
			System.out.println("Key is not found");
		}
		sc.close();

	}

}
