package org.algo;

import java.util.Scanner;


/*
 * 
 * As usual Babul is again back with his problem and now with numbers. He thought of an array of numbers in which he does two types of operation that is rotation and deletion. His process of doing these 2 operations are that he first rotates the array in a clockwise direction then delete the last element. In short he rotates the array nth times and then deletes the nth last element. If the nth last element does not exists then he deletes the first element present in the array. So your task is to find out which is the last element that he deletes from the array so that the array becomes empty after removing it.

For example
A = {1,2,3,4,5,6}.

He rotates the array clockwise i.e. after rotation the array A = {6,1,2,3,4,5} and delete the last element that is {5} so A = {6,1,2,3,4}. Again he rotates the array for the second time and deletes the second last element that is {2} so A = {4,6,1,3}, doing these steps when he reaches 4th time, 4th last element does not exists so he deletes 1st element ie {1} so A={3,6}. So continuing this procedure the last element in A is {3}, so o/p will be 3.
 

Input:
The first line of input contains an integer T denoting the no of test cases. Then T test cases follow. Each test case contains two lines. The first line of each test case contains an integer N. Then in the next line are N space separated values of the array A.
 

Output:
For each test case in a new line print the required result.
 

Constraints:
1<=T<=200
1<=N<=100
1<=A[i]<=10^7
 

Example:
Input
2
4
1 2 3 4
6
1 2 3 4 5 6

Output:
2
3
 * 
 * 
 * 
 * 
 * 
 * */

public class ArrayRotationDeletion {

	public static void main(String[] args) {

		int[] noOfArray = {1,2,3,4,5};
		
		
		int[] copy = leftRotation(noOfArray, 2, 5);
		
		for(int count = 0 ;count<copy.length;count++){
			System.out.println(copy[count]);
		}
		
		
		
		
		
		
		
		
		int[][] arr = new int[100][100];
		 
	        // Input the number of test cases you want to run
	     Scanner sc = new Scanner(System.in);
	     
	     int t = sc.nextInt();
	     //System.out.println("No of Test cases will be: " +t);
	     if(t>0){
	    	 for(int i=0;i<t;i++){
	    		 int arraySize = sc.nextInt();
	    		 //System.out.println("array size is: "+arraySize);
	    		 int[] nthArray = new int[arraySize];
	    		 for(int j=0;j<nthArray.length;j++){
	    			 int arrayValue = sc.nextInt();
	    			 nthArray[j] = arrayValue;
	    		 }
	    		 arr[i] = nthArray;
	    	 }
	     }
	     
	     
	     for(int k=0;k<t;k++){
	    	 int[] arrayK = arr[k];
	    	 int count = 0;
	 		do{
	 			count++;
	 			int[] rotedArray = arrayRotation(arrayK);
	 			arrayK = deleteNodeN(rotedArray, rotedArray.length-count);
	 			
	 		}while(arrayK.length>count);
	 		
	 		System.out.println(arrayK[0]);
	     }
	     
	     
		
		
	}
	
	public static int[] arrayRotation(int[] rotateArray){
		int[] genaratedArray = new int[rotateArray.length];
		
		for(int i = 0 ;i<rotateArray.length;i++){
			if(i==0){
				genaratedArray[i] = rotateArray[rotateArray.length-1]; 
			}
			else{
				genaratedArray[i] = rotateArray[i-1];
			}
			
		}
		return genaratedArray;
	}
	
	public static int[] deleteNodeN(int[] deleteArray,int position){
		int[] deletedArray = new int[deleteArray.length-1];
		for(int i=0,j=0; i<deletedArray.length;j++){
			if(j!=position){
				deletedArray[i] = deleteArray[j];
				i++;
			}
		}
		return deletedArray;
	}
	
	public static int gcd(int a,int b){
		if(b==0){
			return a;
		}
		else{
			return gcd(b, a%b);
		}
	}
	
	public static int[] leftRotation(int[] orginalArray,int d,int n){
		
		int j,k,temp;
		for(int i=0;i<gcd( d,n);i++){
			temp = orginalArray[i];
			j=i;
			
			while(1!=0){
				k = j+d;
				if(k>=n){
					k = k - n;
				}
				if(k==i){
					break;
				}
				orginalArray[j] = orginalArray[k]; 	
				j = k;
				
			}
			orginalArray[j] = temp;
		}
		
		return orginalArray;
		
	}
	
	
	
	

}
