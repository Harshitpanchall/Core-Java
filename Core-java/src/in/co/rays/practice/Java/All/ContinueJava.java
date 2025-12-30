package in.co.rays.practice.Java.All;

public class ContinueJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 10;
	
		for(int i = 1; i <= n; i++) {
			if(i % 4 ==0) {
				continue;
			}
			System.out.println("hello " + i);
		}

	}

}
