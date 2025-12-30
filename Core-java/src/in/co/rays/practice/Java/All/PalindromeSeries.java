package in.co.rays.practice.Java.All;
import java.util.Scanner;
public class PalindromeSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int num  = sc.nextInt();
		int original = num;
		int rev =0;
		int backup = num;
		
		while(num > 0) {
			int digit = num % 10;
			rev = rev * 10 + digit;
			num = num / 10;
			
		}
		if(backup == rev) {
			System.out.println("palindome");
			
		} else {
			System.out.println("not palindrome");
		}

	}

}
