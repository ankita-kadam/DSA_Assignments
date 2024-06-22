package com.sunbeam;
// Write a insertion sort function to sort array and returns no of comparisions
import java.util.Arrays;

public class InsertionSort01 {

	public static void insertionSort(int arr[],int size) {
		int comps=0;
		for(int i=1;i<size-1;i++) {
			int temp=arr[i];
			int j=i-1;
			
			while(j>=0 && arr[j]>temp) {
				comps++;
				arr[j+1]=arr[j];
				j--;
			}
			
			if(j>=0) {
				comps++;
			}
			arr[j+1]=temp;
		}
		System.out.println("Comparisons:"+comps);
	}
	
	public static void main(String[] args) 
	{
		int arr[]= {22,55,77,66,44,33,99,11,88};
	
		System.out.println("Array before sort :"+Arrays.toString(arr));
		
		insertionSort(arr,arr.length);
		
		System.out.println("Array after sort :"+Arrays.toString(arr));
	}

}
