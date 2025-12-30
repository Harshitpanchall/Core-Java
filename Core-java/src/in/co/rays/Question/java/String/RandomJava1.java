package in.co.rays.Question.java.String;
import java.util.Random;
public class RandomJava1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random r = new Random();
		
		for(int i = 1; i <=5; i++) {
			int a = r.nextInt(100);
			System.out.println(a);
		}
			


	}

}
