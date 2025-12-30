package in.co.rays.basic.exercise.java;


// harmonic series in expample of 1/1 + 1/2 + 1/3+ 1/4 it like that;///


public class HarmonicSeries {

	public static void main(String[] args) {
		
		int n = 10;
		double d = 0.0;
		
		for(int i = 1; i <= n; i++) {
			System.out.println("1/" + i);

			if(i != n) {
				System.out.println(" + ");
				
			}
			d = d + (1.0/i); // sum of total 
		}
		System.out.println("sum  = " + d );
	}

}
