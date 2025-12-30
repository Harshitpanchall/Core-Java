package in.co.rays.basic.exercise.java;
import java.util.Scanner;
public class Palindrome2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = 1534;
		int rev = 4351;
		int original1 = num;
		int original2 = rev;
	
		
		while(num>rev) {
			int digit = num % 10;
			rev = rev * 10;
			num = num / 10;
		}
		if(original2 == rev) {
			System.out.println(original2);
		} 
		
		
		if(original1 == original2) {
			System.out.println("Palindrome");
			
		} else {
			System.out.println("not Palindrome");
			
		}
	}

}
