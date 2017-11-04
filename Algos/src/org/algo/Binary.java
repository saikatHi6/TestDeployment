package org.algo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Binary {

	public static void main(String[] args) {

		 Scanner in = new Scanner(System.in);
	     int n = in.nextInt();
	     
	     List<Integer> binaryArr = binary(n);
	     int maxValue = 0;
	     int consicutive = 0;
	     int j=0;
	     for(int i=0;i<binaryArr.size();i++){
	    	 if(binaryArr.get(i)==1){
	    		 consicutive++;
	    	}
	    	 else{
	    		 consicutive = 0;
	    	 }
	    	 if(consicutive>=maxValue){
    			 maxValue = consicutive;
    		 }
	     }
	     System.out.println(maxValue);
	     
	}
	
	public static List<Integer> binary(int n){
		
		List<Integer> binaryArr =new ArrayList<>();
		int mod = 0;
		int count = 0;
		do{
			mod = n%2;
			binaryArr.add(mod);
			n = n/2;
		}while(n!=0);
		
		
		return binaryArr;
	}

}
