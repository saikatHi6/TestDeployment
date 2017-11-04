package org.algo;

import java.util.Scanner;

public class ToggleString {

	public static void main(String[] args) {
		 Scanner s = new Scanner(System.in);
	     String input = s.next();
	     char[] inputArray = input.toCharArray();
	     toggleString(inputArray);
	     
	}
	
	public static void toggleString(char[] input){
		
		for(int i= 0;i<input.length;i++){
			char individulaString = input[i];
			if(individulaString>=97 && individulaString<=122){
				input[i] = (char) (individulaString - 32);
			}
			else{
				input[i] = (char) (individulaString +  32);
			}
		}
		
		for(int j = 0;j<input.length;j++){
			System.out.print(input[j]);
		}
	}

}
