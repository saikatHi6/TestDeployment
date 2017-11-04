package org.algo;

import java.util.Scanner;

/*
 * 
 * Given two strings, a and b , that may or may not be of the same length, determine the minimum number of character deletions required to make a and b anagrams. Any characters can be deleted from either of the strings.

Input :

test cases,t
two strings a and b, for each test case
Output:

Desired O/p

Constraints :

string lengths<=10000

Note :

Anagram of a word is formed by rearranging the letters of the word.

For e.g. -> For the word RAM - MAR,ARM,AMR,RMA etc. are few anagrams.
 * 
 * 
 * 
 * */

public class Anagrams {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int testCases = sc.nextInt();
		String a = sc.next();
		String b = sc.next();
		System.out.println(anagram(a, b));
	}
	
	public static int anagram(String firstString,String secondString){
		
		int count = 0;
		for(int i=0;i<firstString.length();i++){
			
			if(secondString.contains(String.valueOf(firstString.charAt(i)))){
				count++;
			}
		}
		return (firstString.length()-count) + (secondString.length()-count);
	}

}
