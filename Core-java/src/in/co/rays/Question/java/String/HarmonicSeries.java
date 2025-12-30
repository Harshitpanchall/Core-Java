package in.co.rays.Question.java.String;

public class HarmonicSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 10;
		double sum = 0.0;
		
		for(int i = 1; i<= n; i++) {
			System.out.println("1/" + i);
			
			if(i != n) {
				System.out.println(" + ");
				
			}
			sum = sum + (1.0/i);
		}
		System.out.println("sum " + sum);

	}

}
