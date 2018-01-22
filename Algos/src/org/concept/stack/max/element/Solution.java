package org.concept.stack.max.element;

import java.util.Scanner;
import java.util.Stack;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stack<StackNode> stack = new Stack<StackNode>();
		int maxNo = Integer.MIN_VALUE;
		int n = sc.nextInt();
		for (int i = 0; i <n; i++) {
			int inputs = sc.nextInt();
			switch (inputs) {
			case 1:
				int val = sc.nextInt();
				maxNo = Math.max(val, maxNo);

	            stack.add(new StackNode(val, maxNo));
				break;
			case 2:
				if(!stack.isEmpty())
	                stack.pop();
	            // reset max
	            if(stack.isEmpty())
	            	maxNo = Integer.MIN_VALUE;
	            else
	            	maxNo = stack.peek().curMax;
				break;
			case 3:
				if(!stack.isEmpty()) {
	                System.out.println(stack.peek().curMax);
	            }
				break;
			default:
				System.out.println("Inavalid input");
				break;
			}
		}
	}
	
	
	public static void insert(Stack<StackNode> stack,int no,int maxNo){
		int max = Math.max(no, maxNo);
		stack.push(new StackNode(no, max));
	}
	
	public static void delete(Stack<StackNode> stack){
		stack.pop();
	}
	
	public static void displayMax(Stack<StackNode> stack){
		System.out.println(stack.peek().curMax);
	}
	
	static class StackNode{
		int val;
		int curMax;
		public StackNode(int val,int curMax){
			this.val = val;
			this.curMax = curMax;
		}
	}

}
