package com.sunbeam;

public class NonRepeatingElement07 {

	public static int nonRepeatingElement(int arr[],int size)
	{
		boolean isRepeated;
		
		for(int i=0;i<size;i++) {
			isRepeated=false;
		
			for(int j=0;j<size;j++) {
				if(i!=j && arr[i]==arr[j]) {
					isRepeated=true;
					break;
				}
			}
			if(!isRepeated) {
				return arr[i];
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		int arr[]= {1,2,3,-1,2,1,0,4,-1,7,8};
		int ele=nonRepeatingElement(arr,arr.length);
		
		if(ele!=-1) {
			System.out.println("Non-Repeating element:"+ele);
		}else {
			System.out.println("There is no any non-Repeating element");
		}
	}

}
