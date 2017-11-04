package org.algo.basic.implementation;

import java.util.Scanner;

public class NestedLogic {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		int actualDateDay = sc.nextInt();
		int actualDateMonth = sc.nextInt();
		int actualDateYear = sc.nextInt();
		
		int returnDateDay = sc.nextInt();
		int returnDateMonth = sc.nextInt();
		int returnDateYear = sc.nextInt();
		int fine = 0;
		
		if(actualDateYear>returnDateYear){
			fine = 10000;
			System.out.println(fine);
		}
		else if(actualDateYear==returnDateYear && actualDateMonth>returnDateMonth){
			fine = 500*(actualDateMonth-returnDateMonth);
			System.out.println(fine);
		}
		else if(actualDateYear==returnDateYear && actualDateMonth==returnDateMonth && actualDateDay<=returnDateDay){
			System.out.println(fine);
		}
		else if(actualDateYear==returnDateYear && actualDateMonth==returnDateMonth && actualDateDay>returnDateDay){
			fine = 15*(actualDateDay-returnDateDay);
			System.out.println(fine);
		}
		else{
			System.out.println(fine);
		}
		
		
	}

}
