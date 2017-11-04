package org.algo;

import java.util.Scanner;

public class PrimeNumber {
	
	
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        System.out.print(2+" "+3);
   
        for(int i=3;i<=N;i++){
        	 boolean result = isPrime(i);
        	 if(result){
        		 System.out.print(" "+i);
        	 }
        }
       
        
        
	}
	
	public static boolean isPrime(int input){
		boolean result = true;
		
		for(int i=2;i<=input/2;i++){
			if(input%i==0){
				result = false;
				break;
			}
		}
		
		return result;
	}
	
	
}
