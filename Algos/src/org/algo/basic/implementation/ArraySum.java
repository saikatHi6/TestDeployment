package org.algo.basic.implementation;

import java.util.Scanner;

public class ArraySum {

	public static void main(String[] args) {

		 Scanner s = new Scanner(System.in);
	     int N = s.nextInt();
	     
	     long[] array = new long[N];
	     long sum =0;
	     for(int i=0;i<array.length;i++){
	    	 long inputArrayValue = s.nextInt();
	    	 array[i] = inputArrayValue;
	    	 sum = sum + array[i];
	     }
	     
	    
	     System.out.println(sum);
	}

}
