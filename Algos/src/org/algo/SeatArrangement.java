package org.algo;

import java.util.Scanner;

public class SeatArrangement {

	public static void main(String[] args) {
		/*Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        for(int i=1;i<=N;i++){
        	int number = s.nextInt();
        	 System.out.println(" "+positionOfSeat(number));
        }*/
		
		
		Scanner s = new Scanner(System.in);
        int T = s.nextInt();
        int op=0, OP=0, d=0, b=0;
        int[] N = new int[T];
        for( int i = 0; i < T; i++)
            N[i] = s.nextInt();
        
        for( int i = 0; i < T; i++){
            d = N[i] / 12;
            b = N[i] - 12 * d;
            if( b == 0)
                OP = N[i] - 11;
            else{
                op = 13 - b;
                OP = op + 12 * d;
            }
            System.out.print(OP);
            if( b==0 || b==1 || b==6 || b==7 || b==12)
                System.out.println(" WS");
            if( b==2 || b==5 || b==8 || b==11)
                System.out.println(" MS");
            if( b==3 || b==4 || b==9 || b==10)
                System.out.println(" AS");
            
                
        }
		
		
       
	}
	
	public static String positionOfSeat(int n){
		String seatPosition = null;
		int d = n%6;
		if(d==0 || d==1){
			seatPosition = "WS";
		}
		else if(d==2 || d==5){
			seatPosition = "MS";
		}
		else if(d==3 || d==4){
			seatPosition = "AS";
		}
		int rem = n%12;
		switch(rem){

		case 0:

		System.out.print(n-11);

		break;

		case 1:
			System.out.print(n+11);	

		break;

		case 2:
			System.out.print(n+9);

		break;

		case 3:
			System.out.print(n+7);

		break;

		case 4:
			System.out.print(n+5);

		break;

		case 5:
			System.out.print(n+3);

		break;

		case 6:
			System.out.print(n+1);

		break;

		case 7:
			System.out.print(n-1);

		break;

		case 8:
			System.out.print(n-3);

		break;

		case 9:
			System.out.print(n-5);

		break;

		case 10:
			System.out.print(n-7);

		break;

		case 11:
			System.out.print(n-9);

		break;

	}
		return seatPosition;
	}
	
	

}
