package com.sunbeam;

import java.util.Arrays;

public class SelectionSort09 {

	public static int selectionSort(int arr[]) {
		int comps=0;
		for(int i=0;i<arr.length;i++)
		{	
			for(int j=i+1;j<arr.length;j++) 
			{
				comps++;
				if(arr[i]>arr[j])
				{	
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		return comps;
	}
	
	public static void main(String[] args) {
		int arr[]= {55,44,22,77,66,33,11,88,99};
		
		System.out.println(Arrays.toString(arr));
		
		int comps = selectionSort(arr);
		
		System.out.println(Arrays.toString(arr));
		System.out.println("Comparisons :"+comps);
	}

}
