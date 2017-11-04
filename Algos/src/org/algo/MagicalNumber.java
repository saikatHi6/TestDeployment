package org.algo;

import java.util.Scanner;

public class MagicalNumber {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        
        //int[] capsArray = listOfPrime('A');
        //int[] smallArray = listOfPrime('a');
        int k[]={67,71,73,79,83,89,97,101,103,107,109,113}; 
        
        
        
        
        
        for(int i=1;i<=N;i++){
        	int lenth = s.nextInt();
            
            String input = s.next();
            char[] inputArray = input.toCharArray();
            //magicaNumber(inputArray);
            char[] finalString = new char[inputArray.length];
          for(int j=0;j<inputArray.length;j++){
        	  int charValue = next(inputArray[j], k);
        	  finalString[j] = Character.toChars(charValue)[0];
        	  
          }
            
            System.out.println(new String(finalString));
            
            
            
            
        }
        
        
	}
	
	public static void magicaNumber(char[] input){
		
		char[] charArray = new char[input.length];
		for(int i=0;i<input.length;i++){
			char ch = input[i];
			
			int fragmentStart = 0;
			int fragmentEnd = 0;
			
			if(ch>='A' && ch<='Z'){
				fragmentStart = 'A';
				fragmentEnd = 'Z';
			}
			else{
				fragmentStart = 'a';
				fragmentEnd = 'z';
			}
			
			int nextValue = 0;
			int nextresult = 0;
			int prevResult = 0;
			if(fragmentStart == ch)
				nextValue = getNextPrimeNo(ch);
			else if(fragmentEnd==ch)
				nextValue = getPrevPrimeNo(ch);
			else{
				nextresult = getNextPrimeNo(ch);
				prevResult = getPrevPrimeNo(ch);
				int nextDiff = nextresult - ch;
				int prevDiff = ch - prevResult;
				if(nextDiff<prevDiff){
					nextValue = nextresult;
				}
				else if(nextDiff>prevDiff){
					nextValue = prevResult;
				}
				else{
					nextValue = prevResult;
				}
			}
				 
				
			
			charArray[i] = Character.toChars(nextValue)[0];
		}
		System.out.println(new String(charArray));
	}
	
	
	public static int getNextPrimeNo(int no){
		do{
			no++;
		}while(!isPrime(no));
		return no;
	}
	
	public static int getPrevPrimeNo(int no){
		do{
			no--;
		}while(!isPrime(no));
		return no;
	}
	
	
	
	
	public static boolean isPrime(int diff){
		
		boolean result = true;
		for(int i=2;i<=diff/2;i++){
			if(diff%i==0){
				result = false;
				break;
			}
		}
		return result;
		
	}
	
	/*
	 * 
	 * Another way
	 * 
	 * */
	
	public static int[] listOfPrime(int startNo){
		int[] arrayList = new int[20];
		for(int i=0;i<=26;i++){
			if(isPrime(i+startNo)){
				arrayList[i] = startNo;
			}
		}
		return arrayList;
	}
	
	public static void magicalNo(int[] capsPrime,int[] smallPrime,char[] inputArray){
		
		
		for(int i=0;i<inputArray.length;i++){
			int ch = inputArray[i];
			
			if(ch>='A' && ch<='Z'){
				
			}
			else{
				
			}
			
			
		}
	}
	
	public static int nearestChar(int[] primeArray,int find){
		int foundChar = 0;
		
		while(primeArray[foundChar]!=0){
		
			if(primeArray[foundChar]>find){
				
			}
			
			
			
			foundChar++;
		}
		
		
		return foundChar;
	}
	
	
	
	public static int next(int n,int[] k){
		
		int ans =0;
		int d1,d2;
		if(n<=67)  
		   {  
		     ans=67;  
		   }  
		   else if(n>=113)  
		   {  
		     ans=113;  
		   }  
		   else{
			   for(int i=0;i<12;i++)  
			     {  
			       if(k[i]>n)  
			       {  
			         d1=k[i]-n ;  
			         d2=n-k[i-1];  
			         if(d1<d2)  
			         {  
			           ans=k[i];  
			           break;  
			         }  
			         else  
			         {  
			           ans=k[i-1];  
			           break;  
			         }  
			       }  
			     }
		   }
		
		
		return ans;
		
	}
	
	
	public static String getString(int N, String line) {
        String ret = "";
        int ascii=0;
        int asciiP = 0;
        int asciiN = 0;
        for(int i=0; i<N; i++) {
           ascii =(int)line.charAt(i);
           //System.out.println("ascii = "+ascii);
           if(ascii<65)
           {
               ascii=65;
           }
           if(ascii>122){
               ascii=122;
           }
           if(isPrime(ascii)){
               ret = ret + line.charAt(i);
               
           }
           else {
               asciiP = ascii;
               asciiN = ascii;
                
               while(true){
               if(asciiP!=65) asciiP = asciiP-1;
               if(asciiN!=122) asciiN =  asciiN+1;
               
               if(isPrime(asciiP)){
                   //System.out.println(asciiP);
                   ret = ret + (char) asciiP;
                   break;
               }
               else if(isPrime(asciiN)){
                   //System.out.println(asciiN);
                   ret = ret + (char) asciiN;
                   break;
               }
               }
           }
        }
        return ret;
    }

}
