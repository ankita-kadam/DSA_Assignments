package com.sunbeam;

import java.util.Scanner;

public class NoOfComps03 {

	public static int[] linearSearch(int arr[],int size,int key) {
		int comps=0;
		for(int i=0;i<size;i++) {
			comps++;
			if(key==arr[i]) {
				return new int[] {i,comps};
			}
		}
		return new int[] {-1,comps};
	}
	
	public static int[] binarySearch(int arr[],int size,int key) {
		int comps=0;
		int left=0,right=size-1;
		while(left<=right) {
			int mid=(left+right)/2;
			comps++;
			if(key==arr[mid]) {
				return new int[] {mid,comps};
			}else if(key<arr[mid])
			{
				right=mid-1;
			}else {
				left=mid+1;
			}
		}
		return new int[] {-1,comps};
	}
	
	public static void main(String[] args) {
		
		int arr[]= {50,10,30,20,80,90,70,60,40};
		
		int arr1[]= {10,20,30,40,50,60,70,80,90};
		
		Scanner sc= new Scanner(System.in);
		
		//System.out.println("Array :"+arr.toString());
		System.out.println("Enter key to be searched: ");
		int key=sc.nextInt();
		int[] index = linearSearch(arr,arr.length,key);
		
		if(index[0]!=-1) {
			System.out.println("No. of comparisons by Linear search:"+index[1]);
			System.out.println("Key is found at index :"+index[0]);
		}else {
			System.out.println("Key is not found");
			System.out.println("No. of comparisons by Linear search:"+index[1]);
		}
		
		System.out.println("--------------------------------------");
		
		//System.out.println("Array2 :"+arr1.toString());
		System.out.println("Enter key to be searched: ");
		int key1=sc.nextInt();
		int[] index1 = binarySearch(arr1, arr1.length, key1);
		
		if(index[0]!=-1) {
			System.out.println("No. of comparisons by binary search:"+index1[1]);
			System.out.println("Key is found at index :"+index1[0]);
		}else {
			System.out.println("Key is not found");
			System.out.println("No. of comparisons by Linear search:"+index1[1]);
		}
		
	}


}
