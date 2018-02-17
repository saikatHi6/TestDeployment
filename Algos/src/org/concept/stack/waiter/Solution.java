package org.concept.stack.waiter;

import java.util.Scanner;
import java.util.Stack;

public class Solution {

	//	public static void main(String[] args) {
	//		Scanner in = new Scanner(System.in);
	//        int n = in.nextInt();
	//        int q = in.nextInt();
	//        int[] number = new int[n];
	//        for(int number_i = 0; number_i < n; number_i++){
	//            number[number_i] = in.nextInt();
	//        }
	//        int primeNumber = 2;
	//        for(int i=0;i<q;i++){
	//        	while(primeNumber%2!=0){
	//        		primeNumber++;
	//        	}
	//        	for (int j = 0; j < number.length; j++) {
	//				if(number[j]%primeNumber==0){
	//					//Add to B Stack
	//				}
	//				else{
	//					//Add to A Stack
	//				}
	//			}
	//        	primeNumber++;
	//        }
	//		
	//	}


	private static Stack<Integer> data;
	private static Stack<Integer> div_stack;
	private static Stack<Integer> non_div_stack;

	public Solution(int[] raw_data){
		data = new Stack<Integer>();
		div_stack = new Stack<Integer>();
		non_div_stack = new Stack<Integer>();
		for (int i=0; i<raw_data.length; i++)
			data.push(raw_data[i]);
	}

	public void process_division(int Q){
		int iter_num = Q;
		int curNum, prime=2;
		while (iter_num-->0){
			non_div_stack.clear();
			while (!data.isEmpty()){
				curNum = data.pop();
				if (curNum % prime == 0)
					div_stack.push(curNum);
				else
					non_div_stack.push(curNum);
			}
			prime = next_prime(prime);
			print_divisible();
			data = (Stack<Integer>) non_div_stack.clone();
		}
		while (!non_div_stack.isEmpty())
			System.out.println(non_div_stack.pop()+"");
	}

	private int next_prime(int current_prime){
		int prime = current_prime;
		boolean isPrime = false;
		while (!isPrime){
			prime++;
			isPrime = true;
			for (int i=2; i<prime; i++){
				if (prime % i == 0){
					isPrime = false;
					break;
				}
			}
		}
		return prime;
	}

	private void print_divisible(){
		while (!div_stack.isEmpty()){
			System.out.println(div_stack.pop()+"");
		}
	}

	public static void main(String[] args) {
		/* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int Q = sc.nextInt();
		int[] data = new int[N];
		for (int i=0; i<N; i++)
			data[i] = sc.nextInt();
		Solution solution = new Solution(data);
		solution.process_division(Q);
	}


}
