package i.cp.rays.control.statement;
import java.util.Scanner;
public class switch1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the days :-");
		
	int x = sc.nextInt();
	for(int i = 0; i <= 6; i++) {
		System.out.println("days in a weeks  " + i);
	}
	switch(x){
	
	case 1:
		System.out.println("Monday");
		
		
	case 2:
		System.out.println("tuesday");
		
		
	case 3:
		System.out.println("wednesday");
		
		
	case 4:
		System.out.println("thursday");
		
		
	case 5:
		System.out.println("friday");
	
		
	default :
		System.out.println("Invalid day in a print");
		
		
		
	}
			
		
	
	}

	}


