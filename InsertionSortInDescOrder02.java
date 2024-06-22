package com.sunbeam;
//Modify the insertion sort algorithm to sort the array in descending orde
import java.util.Arrays;

public class InsertionSortInDescOrder02 {

	public static void insertionSort(int arr[],int size)
	{
		for(int i=1;i<size;i++) {
			int temp = arr[i];
			int j=i-1;
			
			while(j>=0 && arr[j]<temp)
			{
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=temp;
		}
	}
	public static void main(String[] args) 
	{
		int arr[]= {55,66,22,88,99,77,11,44,33};
		
		System.out.println(Arrays.toString(arr));
		
		insertionSort(arr, arr.length);
		
		System.out.println(Arrays.toString(arr));
	}

}
