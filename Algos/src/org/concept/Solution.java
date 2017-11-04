package org.concept;

import java.util.Scanner;

class Calculator{
    public int power(int n,int p) throws NonNegativeException{
        if(n<0 || p<0){
            throw new NonNegativeException();
        }
        return calculate(n,p);
    }
    
    public int calculate(int n,int p){
        if(p==0){
            return n;
        }
        
            return n*calculate(n,p--);
        
    }
}

class NonNegativeException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public NonNegativeException() {
		super("n and p should be non-negative");
	}
    
}

public class Solution {

	public static void main(String[] args) {
	    
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
        
            int n = in.nextInt();
            int p = in.nextInt();
            Calculator myCalculator = new Calculator();
            try {
                int ans = myCalculator.power(n, p);
                System.out.println(ans);
            }
            catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        in.close();
    }

}
