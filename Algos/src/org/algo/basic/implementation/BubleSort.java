package org.algo.basic.implementation;

import java.util.Scanner;

public class BubleSort {
	
	public static <E> void printArray(E[] elements){
        for(int i=0;i<elements.length;i++){
            System.out.println(elements[i]);
        }
		
    }

	 public static void swap(int a,int b){
	        int temp = a;
	        a = b;
	        b = temp;
	    }

	    public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        int n = in.nextInt();
	        int[] a = new int[n];
	        for(int a_i=0; a_i < n; a_i++){
	            a[a_i] = in.nextInt();
	        }
	        int numberOfSwaps = 0;
	        
	        for (int i = 0; i < n; i++) {
	    // Track number of elements swapped during a single array traversal
	            

	            for (int j = 0; j < n - 1; j++) {
	                // Swap adjacent elements if they are in decreasing order
	                if (a[j] > a[j + 1]) {
	                	int temp = a[j];
	        	        a[j] = a[j+1];
	        	        a[j+1] = temp;
	                    numberOfSwaps++;
	                }
	            }

	            // If no elements were swapped during a traversal, array is sorted
	            if (numberOfSwaps == 0) {
	                break;
	            }
	        }
	        System.out.println("Array is sorted in "+numberOfSwaps+" swaps.");
	        int firstElement  = a[0];
	        int lastElement = a[n-1];
	        System.out.println("First Element: "+firstElement);
	        System.out.println("Last Element: "+lastElement);
	    }

}
