package org.concept.stack.game.stacks;

import java.util.Scanner;

/*game-of-two-stacks*/

public class Solution {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int g = in.nextInt();
        for(int a0 = 0; a0 < g; a0++){
        	
        	
        	
        	
            int n = in.nextInt();
            int m = in.nextInt();
            int x = in.nextInt();
            
            //System.out.println("TC : "+a0+1+ " For "+n+","+m+","+x);
            
            
            int[] a = new int[n];
            for(int a_i=0; a_i < n; a_i++){
                a[a_i] = in.nextInt();
            }
            int[] b = new int[m];
            for(int b_i=0; b_i < m; b_i++){
                b[b_i] = in.nextInt();
            }
           
            int totalPull = 0;
            int count = 0;
            int aIndex = 0;
            int bIndex = 0;
            int currentVal = 0;
            while(aIndex<n && totalPull+a[aIndex]<=x){
            	
            	totalPull+=a[aIndex];
            	aIndex++;
            	
            }
            count = aIndex;
            while(bIndex<m && aIndex>=0){
            	totalPull+= b[bIndex];
            	bIndex++;
            	while (totalPull>x && aIndex>0) {
            		aIndex--;
					totalPull-=a[aIndex];
				}
            	if(totalPull<=x && aIndex+bIndex>count){
            		count = aIndex + bIndex;
            	}
            }
          System.out.println(count);  
            
            
            
        }
        
        
        
        
        
        
	}

}
