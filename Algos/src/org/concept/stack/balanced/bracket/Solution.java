package org.concept.stack.balanced.bracket;

import java.util.Scanner;
import java.util.Stack;

public class Solution {
	static String isBalanced(String s) {

		String result = "YES";

		if(s.length()%2==0){

			Stack<Character> brackeetStack = new Stack<>();
			for (int i = 0; i < s.length(); i++) {
				char bracketType = s.charAt(i);

				if(bracketType=='[' || bracketType=='(' || bracketType=='{' ){
					brackeetStack.add(bracketType);
				}
				else{
					if(!brackeetStack.isEmpty()){
						char stackChar = brackeetStack.pop();
						if(stackChar=='(' && bracketType!=')'){
							result = "NO";

						}
						else if(stackChar=='{' && bracketType!='}'){
							result = "NO";

						}
						else if(stackChar=='[' && bracketType!=']'){
							result = "NO";

						}
					}
					else{
						result = "NO";
					}
					if("NO".equals(result)){
						break;
					}
				}
			}
			if(!brackeetStack.isEmpty()){
				result = "NO";
			}


		}
		else{
			result = "NO";
		}

		return result;
		// Complete this function
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for(int a0 = 0; a0 < t; a0++){
			String s = in.next();
			String result = isBalanced(s);
			System.out.println(result);
		}
		in.close();
	}
}
