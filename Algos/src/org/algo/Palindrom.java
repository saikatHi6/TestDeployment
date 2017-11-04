package org.algo;

import java.util.Scanner;

public class Palindrom {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
        String input = s.next();
        palindrom(input);
	}

	public static void palindrom(String input){
		String reverseString = reverse(input).toString();
		if(input.equals(reverseString)){
			System.out.println("YES");
		}
		else{
			System.out.println("NO");
		}
		
	}
	
	public static StringBuilder reverse(String input){
		
		StringBuilder reverseString = new StringBuilder();
		for(int i=input.length()-1;i>=0;i--){
			
				reverseString = reverseString.append(input.charAt(i));
			
		}
		
		return reverseString;
	}
}
