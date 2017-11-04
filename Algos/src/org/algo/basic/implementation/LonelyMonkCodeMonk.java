package org.algo.basic.implementation;

import java.util.Scanner;

public class LonelyMonkCodeMonk {

	public static void main(String[] args) {

		 Scanner s = new Scanner(System.in);
	     int N = s.nextInt();
		
	     int[] arr = new int[N];
	     for (int i = 0; i < arr.length; i++) {
			arr[i] = s.nextInt();
		}
	     
		System.out.println(countEvenSum(arr, N));
	}
	
	public static long countEvenSum(int[] arr,int n){
		
		long temp[] = {1,0};
		
		long result = 0;
		int sum =0;
		
		for(int i=0;i<=n-1;i++){
			
			sum = ((sum+arr[i])%2+2)%2;
			temp[sum]++;
		}
		
		result = result + (temp[0]*(temp[0]-1)/2);
		result = result + (temp[1]*(temp[1]-1)/2);
		
		return result;
	}
	

}
