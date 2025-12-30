package in.co.rays.basic;
import java.util.Scanner;
public class Checknumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		if(num > 0) {
			System.out.println("postivie no");
			
		}
		else if(num < 0) {
			System.out.println("negative");
			
		}
		else {
			System.out.println("zero");
		}

}
}