package org.concept.stack.simple.text.editor;

import java.util.Scanner;
import java.util.Stack;

public class Solution {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int noOfInputs = sc.nextInt();
		Stack<String> stack = new Stack<>();
		String s = "";
		for (int i = 0; i < noOfInputs; i++) {

			int input = sc.nextInt();
			
			switch (input) {
			case 1:
				String a = sc.next();
				s = appened(a, stack, s);
				break;
			case 2:
				int k = sc.nextInt();
				s = delete(k, stack,s);
				break;
			case 3:
				k = sc.nextInt();
				print(k, s);
				break;
			case 4:
				undo(stack, s);
				s = stack.peek();
				break;	
			
			}


		}


	}


	public static String appened(String text,Stack<String> stack,String opearat){
		
		if(text.isEmpty()){
			text = opearat;
		}
		else{
			text = opearat.concat(text);
		}
		stack.push(text);
		return text;
	}

	public static String delete(int k,Stack<String> stack,String text){
		stack.push(text);
		
		if(text.length()==k){
			return "";
		}
		else{
			return text.substring(0, text.length()-k);
		}
	}

	public static void print(int k,String opearat){
		System.out.println("Text : "+opearat);
		System.out.println(opearat.charAt(k-1));
	}

	public static String undo(Stack<String> stack,String opearat){
		if(!stack.isEmpty()){
			return stack.pop();
		}
		else{
			return opearat;
		}
	}





}
