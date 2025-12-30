package in.co.rays.basic.exercise.java;
import java .util.Scanner;
public class SmallNo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no. : -");
		int small = sc.nextInt();
		
		
		if(small>=90) {
			System.out.println("90 is a largest no. ");
			
		}
		else if(small>=85) {
			System.out.println("85 is b medium small");
		}
			else if(small>=55) {
				System.out.println("55 is c very small no.");
				
			}else {
				System.out.println("Very poor and try again");
			}
		}
	}


