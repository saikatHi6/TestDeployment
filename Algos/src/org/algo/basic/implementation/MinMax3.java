package org.algo.basic.implementation;

import java.util.Arrays;
import java.util.Scanner;

public class MinMax3 {

	public static void main(String[] args) {

		 Scanner s = new Scanner(System.in);
	     int N = s.nextInt();
		
	     int[] array = new int[N];
	     
	     for (int i = 0; i < array.length; i++) {
			array[i] = s.nextInt();
		}
	     
	    Arrays.sort(array);
	    boolean isNo = true;
	    for (int i = array[0]+1; i < array[N-1]; i++) {
			if(Arrays.binarySearch(array, i)<0){
				isNo = false;
				break;
			}
		}
		if(isNo){
			System.out.println("YES");
		}
		else{
			System.out.println("NO");
		}
		
		/*int min = nums[0];
        int max = nums[N-1];
        int ctr = Math.abs(max-min-1);
        
        for(int step = 1, i = 1;i<N||ctr==0;i++) {
            //  System.out.println(step+"-"+ctr+"-"+nums[i]);
            if(ctr==0) {
                 break;
             }
             if(nums[i] == min + step) {
                 step++;
                 ctr--;
             }
        }
        if(ctr==0) System.out.println("YES");
        else System.out.println("NO");*/
		
		
		
		
		
		
		
	}

}
