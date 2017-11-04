package org.algo;

import java.util.Scanner;

public class FindProduct {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		int[] array = new int[N];
		for(int i=0;i<N;i++){
			int arrayValue = s.nextInt();
			array[i] = arrayValue;
		}
		product(array);
	}

	public static void product(int[] array){
		double result = 1.0;
		for(int i=0;i<array.length;i++){
			result = (result * array[i])%((Math.pow(10,9))+7);
		}
		System.out.println((int)result);
	}




}
