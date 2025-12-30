package in.co.rays.Question.java.String;
import java.util.Scanner;
public class ArmsStrongjava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		int original = num;
		int sum = 0;
		
		while(num >0) {
			int digit = num % 10;
			sum = sum + (digit * digit * digit);
			num = num / 10;
			
		} 
		
		if(sum == original) {
			System.out.println("armstrong");
		} else {
			System.out.println("not armstrong");
			
		}
		

	}

}
