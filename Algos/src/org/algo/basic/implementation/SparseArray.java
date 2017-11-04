package org.algo.basic.implementation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class SparseArray {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		List<String> noOfString = new ArrayList<String>();
		Map<String,Integer> quseryString = new HashMap<String,Integer>();
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			noOfString.add(i, sc.next());
		}
		int q = sc.nextInt();
		for (int i = 0; i < q; i++) {
			String query = sc.next();
			if(!quseryString.containsKey(query))
					quseryString.put(query,0);
			if(noOfString.contains(query)){
				int j = 0;
				for (String string : noOfString) {
					
					if(string.equals(query)){
						quseryString.replace(query, ++j);
					}
				}
			}
			System.out.println(quseryString.get(query));
		}
		
	}

}
