package org.algo;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        System.out.println(factorial(N));
	}
	
	public static int factorial(int n){
		
		if(n==1){
			return n;
		}
		else{
			int a = n-1;
			return n*factorial(a);
		}
		
	}

}
