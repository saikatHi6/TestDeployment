package org.algo.basic.implementation;

import java.util.Scanner;

public class ArrayInsert {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int Q = s.nextInt();
        
        int[] array = new int[N];
        for(int i=0;i<N;i++){
        	int arrayValue = s.nextInt();
        	array[i] = arrayValue;
        }
        
        for(int j=0;j<Q;j++){
        	int sum = 0;
        	int f = s.nextInt();
        	int l = s.nextInt();
        	int r = s.nextInt();
        	
        	if(f==1){
        		array[l] = r;
        	}
        	if(f==2){
        		for(int k=l;k<=r;k++){
        			sum = sum + array[k];
        		}
        		System.out.println(sum);
        	}
        	
        	
        }
        
        
	}

}
