package in.co.rays.basic;
import java.util.Scanner;
public class IfThenElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 Scanner sc = new Scanner(System.in);
		
		int marks = sc.nextInt();
		if(marks>=90) {
			System.out.println("grade A");
			
		}else if(marks>= 80) {
				System.out.println("grade B");
			}else if(marks>=70) {
				System.out.println("gradd C");
				
			}else {
				System.out.println("Grage invalid");
			}
		

	}

}
