package in.co.rays.practice.Java.All;

public class FactorialJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/// factorial//
		int n = 5;
		int fact = 1;
		
		for(int i = 1; i<= n; i++) {
			fact = fact * i;
			System.out.println("factorial - : " + " "+ fact);
		}

	}

}
