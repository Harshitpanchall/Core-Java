package i.cp.rays.control.statement;
import java.util.Scanner;
public class admin {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		switch(n) {
		
		case 1: 
			System.out.println("option 1 selected ");
			break;
			
		case 2:
			System.out.println("option 2 selected ");
			break;
			
		case 3:
			System.out.println("option 3 selected ");
			break;
			
		case 4:
			System.out.println("option 4 selected");
			break;
			
			default:
				System.out.println("invalid selected");
				break;
		}
	}

}
