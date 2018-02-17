package org.concept.queue.stack;

import java.util.Scanner;
import java.util.Stack;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int noOfQuery = sc.nextInt();
		Stack<Integer> stack1 = new Stack<>();
		Stack<Integer> stack2 = new Stack<>();
		for(int i=0;i<noOfQuery;i++){
			int input = sc.nextInt();
			switch(input){
			case 1: enque(stack1, sc.nextInt());
			break;
			case 2: deque(stack1,stack2);
			break;
			case 3: display(stack1,stack2);
			break;	
			}
		}
	}

	private static void enque(Stack<Integer> stack,int no){
		stack.push(no);
	}

	private static void deque(Stack<Integer> one,Stack<Integer> two){
		if(two.isEmpty())
		{
			while(!one.isEmpty())
			{
				two.push(one.pop());
			}                    
		}
		if(!two.isEmpty()){
			two.pop();
		}
	}

	private static void display(Stack<Integer> one,Stack<Integer> two){

		if(two.isEmpty()){
			while(!one.isEmpty()){
				two.push(one.pop());
			}
			System.out.println(two.peek());
		}
		else{
			System.out.println(two.peek());
		}


	}
}
