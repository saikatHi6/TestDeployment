package org.algo;

import java.util.Scanner;

public class RoyProfile {

	public static void main(String[] args) {
		 Scanner s = new Scanner(System.in);
	     int N = s.nextInt();
	     int noOfInput = s.nextInt();
	     for (int i = 1; i <= noOfInput; i++) {
			int h = s.nextInt();
			int w = s.nextInt();
			if(h<N || w<N){
				System.out.println("UPLOAD ANOTHER");
			}
			else if(h==w && (h>=N || w>=N)){
				System.out.println("ACCEPTED");
			}
			else{
				System.out.println("CROP IT");
			}
		}
	     
	     
	     
	}

}
