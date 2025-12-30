package in.co.rays.Question.java.String;

public class FibonnaicSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 10;
		int first =0 , second = 1;
		
		int nextnum;
		
		for( int i = 0; i <= n; i++) {
			nextnum = first + second;
			first = second;
			second = nextnum;
			System.out.println(first);
		}
		
		

	}

}
