package org.algo.basic.implementation;

import java.util.Scanner;

public class ArrayManipulation {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        long[] array = new long[n];
        for(int a0 = 0; a0 < m; a0++){
            int a = in.nextInt();
            int b = in.nextInt();
            int k = in.nextInt();
            for(int j=a-1;j<=b-1;j++){
            	array[j] = array[j]+k;
            }
            
        }
        long max = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println(max);
        in.close();
	}

}
