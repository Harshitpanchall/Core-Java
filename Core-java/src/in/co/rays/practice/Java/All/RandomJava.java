package in.co.rays.practice.Java.All;
import java.util.Random;
public class RandomJava {
	
public static void main(String args[]) {
	
	Random r = new Random();
	for(int i = 1; i <= 5; i++) {
		int a = r.nextInt(100);
		System.out.println("Random -" + a);
	}
	
}

}
