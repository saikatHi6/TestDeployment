package org.concept.smartest.set;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Solution {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int testCases = sc.nextInt();
		for(int i=0;i<testCases;i++){
			int noOfElements = sc.nextInt();
			Set<Integer> setOfNumber = new HashSet<>();
			for(int j=0;j<noOfElements;j++){
				setOfNumber.add(sc.nextInt());
			}
			Map<Integer, Set<Integer>> binarySet = new HashMap<>();
			for (Integer setNo : setOfNumber) {
				int countOne = 0;
				int orginalNo = setNo;
				while(setNo!=0){
					
					int mod = setNo%2;
					setNo = setNo/2;
					if(mod==1){
						countOne++;
					}
				}
				if(binarySet.containsKey(countOne)){
					Set<Integer> smartSet = binarySet.get(countOne);
					smartSet.add(orginalNo);
				}
				else{
					Set<Integer> smartSet = new TreeSet();
					smartSet.add(orginalNo);
					binarySet.put(countOne, smartSet);
				}
			}
			Set<Integer> smartestSet = new TreeSet<>();
			for(Map.Entry<Integer, Set<Integer>> entrySet:binarySet.entrySet()){
				smartestSet.add(entrySet.getValue().iterator().next());
			}
			
			for (Integer smartestSetValues : smartestSet) {
				System.out.println(smartestSetValues);
			}
			
			
		}
	}
	
	
}
