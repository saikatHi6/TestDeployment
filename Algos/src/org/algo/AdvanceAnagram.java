package org.algo;

import java.util.Scanner;

public class AdvanceAnagram {
	
	public static final int NUMBER_LETTER = 26;

	public static int getDelta(int[] firstArray,int secondArray[]){
		if(firstArray.length != secondArray.length){
			return -1;
		}
		int delta = 0;
		
		for(int i=0;i<firstArray.length;i++){
			int diffrence = Math.abs(firstArray[i]-secondArray[i]);
			delta += diffrence;
		}
		
		return delta;
	}
	
	public static int[] getCharCount(String s){
		int[] charCount = new int[NUMBER_LETTER];
		for(int i =0 ; i<s.length(); i++){
			char c = s.charAt(i);
			int offset = (int)'a';
			int code = c - offset;
			charCount[code]++;
		}
		
		return charCount;
	}
	
	public static int numberNeed(String a,String b){
		int firstArray[] = getCharCount(a);
		int secondArray[] = getCharCount(b);
		return getDelta(firstArray, secondArray);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testCases = sc.nextInt();
		String a = sc.next();
		String b = sc.next();
		System.out.println(numberNeed(a, b));
		
	}

}
