package org.concept.stack.balanced.equal.stack;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		
		/*Scanner in = new Scanner(System.in);
	    int n1 = in.nextInt();
	    int n2 = in.nextInt();
	    int n3 = in.nextInt();
	    int[] numberOfCylinders = {n1, n2, n3};
	    int[][] stack = {new int[n1], new int[n2], new int[n3]};
	    int[] height = {0, 0, 0}; 
	    for (int i = 0; i < 3; i++) {
	        for (int j = 0; j < numberOfCylinders[i]; j++) {
	            int cylinderHeight = in.nextInt();
	            stack[i][j] = cylinderHeight;
	            height[i] += cylinderHeight;
	        }   
	    }
	    int[] index = {0, 0, 0};
	    int targetHeight = Math.min(Math.min(height[0], height[1]), height[2]);
	    while (height[0] != height[1] || height[1] != height[2]) {
	        for (int i = 0; i < 3; i++) {
	            if (height[i] > targetHeight) {
	                height[i] -= stack[i][index[i]++]; 
	                targetHeight = Math.min(targetHeight, height[i]);
	            }
	        }
	    }
	    System.out.println(targetHeight);*/

	    
	    Scanner in = new Scanner(System.in);
        int n1 = in.nextInt();
        int n2 = in.nextInt();
        int n3 = in.nextInt();
        int height[] = new int[3];
        int h1[] = new int[n1];
        for(int h1_i=0; h1_i < n1; h1_i++){
            h1[h1_i] = in.nextInt();
            height[0] = height[0]+h1[h1_i];
        }
        int h2[] = new int[n2];
        for(int h2_i=0; h2_i < n2; h2_i++){
            h2[h2_i] = in.nextInt();
            height[1] = height[1]+h2[h2_i];
        }
        int h3[] = new int[n3];
        for(int h3_i=0; h3_i < n3; h3_i++){
            h3[h3_i] = in.nextInt();
            height[2] = height[2]+h3[h3_i];
        }
	    
	     
	    int targatedHeight = Math.min(Math.min(height[0], height[1]), height[2]);
	    int[] index = {0, 0, 0};
	    int selection[] = new int[3];
	    while(height[0] !=height[1] || height[1]!=height[2]){
	    	
	    	for(int i=0;i<3;i++){
	    		if(height[i]>targatedHeight){
	    			if(i==0){
	    				selection = h1;
	    			}
	    			else if(i==1){
	    				selection = h2;
	    			}
	    			else{
	    				selection = h3;
	    			}
	    			height[i] = height[i] - selection[index[i]++];
	    			targatedHeight = Math.min(height[i], targatedHeight);
	    		}
	    	}
	    	
	    	
	    }
	    
	    
	    
	    
	    System.out.println(targatedHeight);
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
		
	}

}
