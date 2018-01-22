package org.concept.swap.largest.rectangle;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

public class Solution {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] h = new int[n];
        for(int h_i = 0; h_i < n; h_i++){
            h[h_i] = in.nextInt();
        }
        long result = largestRectangle(h);
        System.out.println(result);
        in.close();
	}
	
	static long largestRectangle(int[] h) {
		
		Deque<Integer> stack = new LinkedList<Integer>();

		int maxArea = Integer.MIN_VALUE;
		int area = 0;
		int i;
		for(i=0;i<h.length;){
			if(stack.isEmpty() || h[stack.peekFirst()]<=h[i]){
				stack.push(i++);
			}
			else{
				int top = stack.pollFirst();
				
				if(stack.isEmpty()){
					area = h[top]*i; 
				}
				else{
					area = h[top] * (i - stack.peekFirst()-1);
				}
			}
			if(area>maxArea){
				maxArea = area;
			}
		}
		
		while(!stack.isEmpty()){
            int top = stack.pollFirst();
            //if stack is empty means everything till i has to be
            //greater or equal to input[top] so get area by
            //input[top] * i;
            if(stack.isEmpty()){
                area = h[top] * i;
            }
            //if stack is not empty then everything from i-1 to input.peek() + 1
            //has to be greater or equal to input[top]
            //so area = input[top]*(i - stack.peek() - 1);
            else{
                area = h[top] * (i - stack.peekFirst() - 1);
            }
        if(area > maxArea){
                maxArea = area;
            }
        }
		
		
		
		/*while (index<h.length) {
			if(!stack.isEmpty()){
				while(!stack.isEmpty() && h[index]<h[stack.peek()]){
					long removedArea = removeFromStack(h, index, stack);
					if(maxArea<removedArea){
						maxArea = removedArea;
					}
				}
			}
			stack.push(index);
			index++;
		}
		
		while (!stack.isEmpty()) {
			long removedArea = removeFromStack(h, index, stack);
			if(maxArea<removedArea){
				maxArea = removedArea;
			}
		}*/
		
		
		
		return maxArea;
    }
	
	
	static long removeFromStack(int[] input,int index,Stack<Integer> stack){
		int top = stack.pop();
		long calculateArea = 0;
		if(stack.isEmpty()){
			calculateArea = input[top]*1;
		}
		else{
			calculateArea = input[top] * (index-stack.peek()-1);
		}
		
		
		
		return calculateArea;
		
	}
	
	
	

}
