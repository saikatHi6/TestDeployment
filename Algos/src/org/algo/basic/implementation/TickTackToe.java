package org.algo.basic.implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class TickTackToe {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		int sum = 'x' + 'x' + '.';
		for (int i = 0; i < n; i++) {
			char array[][] = new char[4][4];
			for (int j = 0; j < 4; j++) {
				array[j] = br.readLine().toCharArray();
			}
 
			System.out.println(getResult(array, sum));
		}
		
        /*for(int i=0;i<N;i++){
        	ticTacBoard(s);
        }*/
        
	}
	
	public static String getResult(char array[][], int sum) {
		
		
		for (int j = 0; j < 4; j++) {
			for (int k = 0; k < 4; k++) {
 
				if (k < 2 && (array[j][k] + array[j][k + 1] + array[j][k + 2]) == sum) {
					return "YES";
				}
 
				if (j < 2 && (array[j][k] + array[j + 1][k] + array[j + 2][k]) == sum) {
					return "YES";
				}
 
				if (j < 2 && k < 2 && (array[j][k] + array[j + 1][k + 1] + array[j + 2][k + 2]) == sum) {
					return "YES";
				}
 
				if (j >= 2 && k < 2 && (array[j][k] + array[j - 1][k + 1] + array[j - 2][k + 2]) == sum) {
					return "YES";
				}
			}
		}
		
		
		
		
		
		
		return "NO";
	}
	
	
	
	
	
	
	/*public static void ticTacBoard(Scanner s){
		String[] ticBoarf = new String[4];
		
        for (int i = 0; i < ticBoarf.length; i++) {
			String row = new String();
			for (int j = 0; j < 4; j++) {
				row = row + s.next();
			}
			ticBoarf[i] = row;
		}
        
        boolean result = false;
        
        for (int i = 0; i < ticBoarf.length; i++) {
			if(checkHorizantal(ticBoarf[i])){
				result = true;
				break;
			}
			if(checkVertical(ticBoarf, i)){
				result = true;
				break;
			}
			
		}
        if(!result){
        	if(!checkDiagonal(ticBoarf)){
        		result = true;
        	}
        }
        if(result){
        	System.out.println("YES");
        }
        else{
        	System.out.println("NO");
        }
	}
	
	
	public static boolean checkHorizantal(String[] horizontalLine){
		boolean result = false;
		String valueO = "o";
		String valueD = ".";
		String valueX = "x";
		int count = 0;
		int countD = 0;
		if(valueO.equals(horizontalLine[2])||valueO.equals(horizontalLine[3])){
			result = true;
		}
		for (int i = 0; i < horizontalLine.length; i++) {
			if(valueX.equals(horizontalLine[i])){
				count++;
			}
			else if(valueD.equals(horizontalLine[i])){
				countD++;
			}
		}
		if(count>2 && valueX.equals(horizontalLine[2])||valueX.equals(horizontalLine[3]) && countD>0){
			result = true;
		}
		return result;
	}
	
	public static boolean checkVertical(String[][] verticalLine,int i){
		boolean result = false;
		String valueO = "o";
		String valueD = ".";
		String valueX = "x";
		int countD = 0;
		int count = 0;
		for (int j = 0; j < verticalLine.length; j++) {
			if(valueX.equals(verticalLine[j][i])){
				count++;
			}
			else if(valueD.equals(verticalLine[j][i])){
				countD++;
			}
		}
		if(count>2 && (valueX.equals(verticalLine[i][2])||valueX.equals(verticalLine[i][3])) && countD>0){
			result = true;
		}
		return result;
	}
	
	public static boolean checkDiagonal(String[][] verticalLine){
		boolean result = false;
		String valueO = "o";
		String valueD = ".";
		String valueX = "x";
		int count = 0;
		for (int i = 0; i < verticalLine.length; i++) {
			if(valueX.equals(verticalLine[i][i])){
				count++;
			}
		}
		if(count>2 && valueX.equals(verticalLine[2][2])||valueX.equals(verticalLine[3][3])){
			result = true;
		}
		return result;
	}*/
	

}
