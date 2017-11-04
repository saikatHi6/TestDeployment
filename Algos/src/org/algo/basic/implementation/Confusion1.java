package org.algo.basic.implementation;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Confusion1 {

	public static void main(String[] args) {

		 Scanner s = new Scanner(System.in);
	     int N = s.nextInt();
	     int Q = s.nextInt();
	     int[] array = new int[N];
	     for (int i = 0; i < array.length; i++) {
			int arrValue = s.nextInt();
			array[i] = arrValue;
		}
	    
	     for(int i=0;i<Q;i++){
	    	 int query = s.nextInt();
	    	 System.out.println(countDistinct(array, query, N)); 
	     }
	     
	   
	     
	}
	
	public static int countDistinct(int[] array,int query,int N){
		
		Set distinctNo = new HashSet();
	    for(int i=query-1;i<N;i++){
	    	int no = array[i];
	    	distinctNo.add(no);

	    }
		return distinctNo.size();
	}

}
