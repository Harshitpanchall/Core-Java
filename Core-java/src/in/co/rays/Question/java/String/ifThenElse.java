package in.co.rays.Question.java.String;
import java.util.Scanner;
public class ifThenElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int day = sc.nextInt();
		
		if(day >= 90) {
			System.out.println("hello");
			
		} else if(day>= 80) {
			System.out.println("hello B");
			
		} else if(day >= 70) {
			System.out.println("C");
			
		} else if(day>= 50) {
			System.out.println("d");
			
		}else {
			System.out.println("invalid sorrry");
		}

	}

}
