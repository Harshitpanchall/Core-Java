package in.co.rays.basic.exercise.java;
import java.util.Scanner;
public class ArmStrongSeries {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
	
		int num = sc.nextInt();
		int original = num;
		int sum = 0;
		
		while(num > 0) {
			int digit = num % 10;
			sum = sum + (digit * digit * digit); //add karo or multiply karo
			num = num / 10;
			
		}
		
	/// compare
		if(sum == original) {
			System.out.println("armstrong");
			
		} else {
			System.out.println("not a armstrong");
		}
		

	}

}
