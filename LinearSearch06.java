package com.sunbeam;
// 6. Implement linear search algorithm to find the nth occurence of the given element. If nth occurrence is
//not found, return -1.
import java.util.Arrays;
import java.util.Scanner;
//
public class LinearSearch06 {

	public static int linearSearch(int arr[],int size,int key,int pos) {
		int count=0;
		for(int i=0;i<size-1;i++) {
			
			if(key==arr[i]) {
				count++;
				if(count==pos)
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
		System.out.println("Enter position at which you want to search: ");
		int pos=sc.nextInt();
		
		int index = linearSearch(arr,arr.length,key,pos);
		if(index!=-1) {
			System.out.println("Key is found at index :"+index+" which is at "+pos+" position");
		}else {
			System.out.println("Key is not found");
		}
		sc.close();

	}

}
