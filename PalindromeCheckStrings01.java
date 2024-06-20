package com.sunbeam;

import java.util.Stack;

public class PalindromeCheckStrings01 {
	
	public static boolean reverseAndCompare(String str) 
	{
		String reversedStr = new StringBuilder(str).reverse().toString();
		return str.equals(reversedStr);
	}
	
	public static boolean twoPointerTechnique(String str) 
	{
		int left =0, right =str.length()-1;
		
		while(left<right) {
			if(str.charAt(left)!=str.charAt(right))
				return false;
			left++;
			right--;
		}
		return true;
	}
	
	public static boolean recursiveApproach(String str,int left,int right) {
		//To make it efficient condition: 
		if(left>=right) {
			return true;
		}
		
		if(str.charAt(left)!=str.charAt(right))
		{
			return false;
		}
		
		return recursiveApproach(str,left+1,right-1);
	}
	
	public static boolean usingStack(String str)
	{
		Stack<Character> stack = new Stack<>();
		
		for(char c:str.toCharArray()) {
			stack.push(c);
		}
		
		StringBuilder reversedStr = new StringBuilder();
		while(!stack.isEmpty())
		{
			reversedStr.append(stack.pop());
		}
		return str.equals(reversedStr.toString());
		
	}
	
	public static void main(String[] args) {
		String testStr="radar";
		System.out.println("Is palindrome :"+reverseAndCompare(testStr));
		/*
		Time Complexity = O(n)
		Space Complexity = O(n)
		*/
		System.out.println("---------------------------");
		System.out.println("Is palindrome :"+twoPointerTechnique(testStr));
		/*
		Time Complexity = O(n)
		Space Complexity = O(1) 
		As no additional space is used, T(n)=O(n)
		*/
		System.out.println("---------------------------");
		System.out.println("Is palindrome :"+recursiveApproach(testStr,0,testStr.length()-1));
		/*
		Time Complexity = O(n)
		Space Complexity = O(n) 
		*/
		System.out.println("---------------------------");
		System.out.println("Is palindrome :"+usingStack(testStr));
		/*
		Time Complexity = O(n)
		Space Complexity = O(n) 
		*/
		

		
		
	}

}
