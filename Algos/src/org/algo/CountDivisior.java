package org.algo;

import java.util.Scanner;

public class CountDivisior {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
        int L = s.nextInt();
        int R = s.nextInt();
        int K = s.nextInt();
        
        
        
        int count = 0;
        for(int i =L ;i<=R;i++){
        	if(i%K==0){
        		count++;
        	}
        }
        System.out.println(count);
        
	}

}
