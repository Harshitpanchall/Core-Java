package in.co.rays.basic.exercise.java;

/// example on palinedrome input 121 same digit and reverse no. 121 and
//not palinedrome 122 and reverse 221 is not a palindrome;//

import java.util.Scanner;

public class PalinedromeNo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt(); //number input 
		int rev =0;// reverse store 
		int backup = num;// original store vale num
		
		while(num>0) {
			
			int digit = num % 10; //last digit exit it
			rev = rev * 10 + digit; // reverse add 
			num = num / 10;////last digit hatao
		
			
		}
		/// compare on palindorme
		
		if(backup == rev) {
			System.out.println("Palinedrome");
			
		} else {
			System.out.println("not Palinedrome");
		}

	}

}
