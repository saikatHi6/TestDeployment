package org.algo.basic.implementation;

import java.util.Scanner;

public class ArrayLeftRotation {

	static int[] leftRotation(int[] a, int d) {
		int k=0;
		int[] b = new int[a.length];
		for (int i = d; i < a.length; i++) {
			b[k] = a[i];
			k++;
		}
		for(int j=0;j<d;j++){
			b[k] = a[j];
			k++;
		}


		return b;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int d = in.nextInt();
		int[] a = new int[n];
		for(int a_i = 0; a_i < n; a_i++){
			a[a_i] = in.nextInt();
		}
		int[] result = leftRotation(a, d);
		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i] + (i != result.length - 1 ? " " : ""));
		}
		System.out.println("");


		in.close();
	}

}
