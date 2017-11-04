package org.algo;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import java.util.Scanner;
import java.util.StringTokenizer;

public class PlayWithNo {
	
	
	static class FastReader
    {
        BufferedReader br;
        StringTokenizer st;
        public FastReader()
        {
            br=new BufferedReader(new InputStreamReader(System.in));
        }
        String next()
        {
            while(st==null || !st.hasMoreElements())
            {
                try
                {
                    st=new StringTokenizer(br.readLine());
                }
                catch(Exception ex)
                {
                    
                }
            }
            return st.nextToken();
        }
        int nextInt()
        {
            return Integer.parseInt(next());
        }
        long nextLong()
        {
            return Long.parseLong(next());
        }
    }
	
	

	public static void main(String[] args) {
		
		
		
		
		FastReader sc=new FastReader();
        int n=sc.nextInt();
        int q=sc.nextInt();
        long ar[]=new long[n+1];
        ar[0]=0;
        for(int i=1;i<=n;i++)
            ar[i]=ar[i-1]+sc.nextLong();
        while(q-->0)
        {
            int l=sc.nextInt();
            int r=sc.nextInt();
            System.out.println((ar[r]-ar[l-1])/(r-l+1));
        }
		
		
		/*

		Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int q = s.nextInt();
        
        int[] arrayElements =  new int[N];
        
        for(int i=0;i<arrayElements.length;i++){
        	
        	int arrayElement = s.nextInt();
        	if(i==0){
        		arrayElements[i] = arrayElement;
        	}
        	for(int j=0;j<i;j++){
        		arrayElements[i] = arrayElement + arrayElements[j];
        	}
        	
        }
        
       // int[][] quistions = new int[q][];
       
       // Map<Integer, int[]> qustionMap = new HashMap<>();
        
        for(int j=0;j<q;j++){
        	//int[] query = new int[2];
        	int l = s.nextInt();
        	int r = s.nextInt();
        	int sum =0;
        	
        	if(l==1){
        		sum = arrayElements[r-1];
        	}
        	else{
        		sum =   arrayElements[r-1] - arrayElements[0];
        	}
        	System.out.println(sum/getSubArraySum(l, r));
        	
        	
        	
        	
        	
        	//query[0] = l;
        	//query[1] = r;
        	//qustionMap.put(j, query);
        }
        
        for(int j=0;j<q;j++){
        	
        	int[] query = new int[2];
        	int l = s.nextInt();
        	int r = s.nextInt();
        	query[0] = l;
        	query[1] = r;
        	quistions[j] = query;
        }
        
        for(int k=0;k<quistions.length;k++){
        	int sum = 0;
        	int[] subArray = quistions[k];
        	if(subArray[0]==1){
        		sum = arrayElements[subArray[1]-1];
        	}
        	else{
        		sum =   arrayElements[subArray[1]-1] - arrayElements[0];
        	}
        	System.out.println(sum/getSubArraySum(subArray[0], subArray[1]));
        }
        
        for(int k : qustionMap.keySet()){
        	int sum = 0;
        	int[] subArray = qustionMap.get(k);
        	if(subArray[0]==1){
        		sum = arrayElements[subArray[1]-1];
        	}
        	else{
        		sum =   arrayElements[subArray[1]-1] - arrayElements[0];
        	}
        	System.out.println(sum/getSubArraySum(subArray[0], subArray[1]));
        }
        
        
        
		
	*/}

	public static int getSubArraySum(int l,int r){
		return (r-l)+1;
	}
	
	
}
