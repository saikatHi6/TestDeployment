package org.algo.basic.implementation;

import java.util.Scanner;

public class TheGreatKian {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int[] array = new int[N];
        
        for (int i = 0; i < array.length; i++) {
			array[i] = s.nextInt();
		}
        long s1 = 0;
        long s2 = 0;
        long s3 = 0;
        for (int i = 0,j=1,k=2; i < array.length;i = i + 3,j = j + 3,k = k + 3) {
			
        	s1 = s1 + array[i];
        	if(j<array.length){
        		s2 = s2 + array[j];
        	}
        	if(k<array.length){
        		s3 = s3 + array[k];
        	}
        	
		}
        System.out.println(s1+" "+s2+" "+s3);
        
	}

}
