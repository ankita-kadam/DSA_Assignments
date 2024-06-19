package com.sunbeam;

import java.util.Scanner;

//Write all possibilites to check palindrome. Also do time and space complexity analysis.
public class PalindromeCheckNumbers01 {

	public static int isPalindrome(int num) {
		int rev=0;
		while(num>0) {
			rev =rev*10+num%10;
			num = num /10 ;
		}
		return rev;
	}
	
	
	public static void main(String[] args) {
		int num;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter num to check palindrome :");
		num=sc.nextInt();
		
		int returnedInt = isPalindrome(num);
		if(returnedInt==num) {
			System.out.println(num+" is palindrome");
		}
		else
		{
			System.out.println(num+" is not a palindrome");
		}
		
	}

}
