package in.co.rays.practice.Java.All;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "Harshit Panchal";
		int part = name.length();
		System.out.println(part);
		
		for(int i = name.length()-1; i>=0; i--) {
			System.out.print(name.charAt(i));
		}

	}

}
