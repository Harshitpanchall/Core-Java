
package in.co.rays.basic;
import java.util.Scanner;
public class marks {
public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	int marks = sc.nextInt();
	
	if(marks >= 90) {
		System.out.println("A");
	}
	else if(marks >= 75) {
		System.out.println("B");
		
	}
else if(marks >= 65) {
	System.out.println("c");
}

else {
	System.out.println("d");

}
}

}
