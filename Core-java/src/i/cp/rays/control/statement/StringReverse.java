package i.cp.rays.control.statement;

public class StringReverse {

	public static void main(String[] args) {
		
		String name = "Harshit Panchal";
		for(int i = name.length() - 1; i>= 0; i--) {
			System.out.print(name.charAt(i));
		}
		System.out.println(" ");
	}
	
}
