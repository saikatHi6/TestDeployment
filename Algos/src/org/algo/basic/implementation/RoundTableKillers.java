package org.algo.basic.implementation;

import java.util.Scanner;

public class RoundTableKillers {
	
	
	public static class Person {
		
		public int currentId = 0;
		public Person nextId = null;
		
		public Person(int currentId) {
			this.currentId = currentId;
			this.nextId = null;
		}
		
		
		
		
		
		
	}
	
	
	private static Person createCircularList(int A,int len){
		int count = 0;
		Person temp = new Person(-1);
		Person start = temp;
		Person startNode = null;
		
		while(len>0){
			 Person person = new Person(count);
			 count++;
			 temp.nextId = person;
			 temp = person;
			 len--;
			 if(person.currentId == A){
				 startNode = person;
			 }
		}
		
		start = start.nextId;
		temp.nextId = start;
		return startNode;
		
	}
	
	
	
	

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int K = s.nextInt();
        int X = s.nextInt();
        
        int len = N;
        Person start = createCircularList(X-1, N);
        
        while(true) {
            int mod = (start.currentId+1) % K;
            if(len < mod ){
                break;
            }
            while (true) {
                //start = start.next;
                if(mod ==0){
                    start = start.nextId;
                    break;
                }
                start.nextId = start.nextId.nextId;
                mod--;
                len--;
            }
 
        }
        System.out.println(start.currentId+1);
        
        
	}

}
