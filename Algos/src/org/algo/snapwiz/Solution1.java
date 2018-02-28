package org.algo.snapwiz;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Solution1 implements Runnable{
	
	String spice = "Yes";

	
	public static char maxChar(String s){
		Map<Character, Integer> charCon = new HashMap<>();
		
		for(int i=0;i<s.length();i++){
			int x = s.charAt(i);
			if(charCon.containsKey(s.charAt(i)) && (x>='a' && x<='z')){
				int count = charCon.get(s.charAt(i));
				charCon.put(s.charAt(i), ++count);
			}
			else{
				charCon.put(s.charAt(i), 1);
			}
		}
		
		int maxCount = 0;
		char finalChar = 0;
		for(Entry<Character, Integer> entry:charCon.entrySet()){
			if(maxCount<entry.getValue()){
				maxCount = entry.getValue();
				finalChar = entry.getKey();
			}
		}
		return finalChar;
	}
	
	static int counter = 0;
	
	
	
	
	
	
	public static void main(String[] args) throws InterruptedException {

		//System.out.println(maxChar("today my mom cooked egg curry for me"));
		/*while(true){
			try{
				counter++;
				return;
			}
			finally{
				counter++;
				break;
			}
			
		}
		System.out.println(counter);*/
		
		Solution1 sol = new Solution1();
		Thread t = new Thread(sol);
		t.start();
		t.sleep(1000);
		for(int i=0;i<10;i++){
			System.out.println(sol.spice);
		}
		
		
	}






	@Override
	public void run() {

		this.spice = "No";
		
		
	}

}
