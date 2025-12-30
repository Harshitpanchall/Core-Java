package in.co.rays.practice.Java.All;

public class MaxminiJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		int b = 20;
		int sum = 30;
		if(a>b) {
			System.out.println("max"+ a);
			
		} else {
			System.out.println("max" + b);
			
		}
		if(a<b) {
			System.out.println("mini"+ a);
			
		} else {
			System.out.println("mini"+ b);
			
		}
		if(a>b || a<b) {
			System.out.println("mini or max" + a +b);
			sum = sum; 
			System.out.println(" total sum : - "+" " +sum);
		}

	}

}
