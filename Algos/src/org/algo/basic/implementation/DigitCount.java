package org.algo.basic.implementation;

import java.util.Scanner;

public class DigitCount {

	public static void main(String[] args) {

		
		Scanner s = new Scanner(System.in);
        String input = s.next();
		int[] digits = new int[10];
		char[] inputDigit = input.toCharArray();
		for(int i=0;i<input.length();i++){
			int singleDigit = inputDigit[i] - '0';
			digits[singleDigit]++;
		}
		
		for(int j=0;j<digits.length;j++){
			System.out.println(j+" "+digits[j]);
		}
		
	}

}
