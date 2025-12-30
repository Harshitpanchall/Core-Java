package in.co.rays.basic.exercise.java;

public class FibonacciSeries {

	public static void main(String[] args) {
	
		int n = 10;
		int first = 0, second = 1;
		
		int nextnum;
		
		for(int i = 0; i <= 10; i++) {
			 nextnum = first + second;
			 System.out.println(nextnum);
			 
			 first = second;
			 second = nextnum;
			
		}

	}

}
