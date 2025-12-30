package in.co.rays.practice.Java.All;

import java.util.Scanner;
public class FibonacciSeries {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner sc = new Scanner(System.in);
	
	int n = 10;
	
	int first = 0,  second = 1;
	int nextnum;
	
	for(int i = 1; i<=n; i++) {
		System.out.println(first);
		
		nextnum = first + second;
		first = second;
		second = nextnum;
		
	}
		
		

	}

}
