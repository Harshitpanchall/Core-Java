package in.co.rays.Question.java.String;

public class QuestionReverseString1 {

	public static void main(String[] args) {
		String name = "Harshit Panchal";
		System.out.println(name.length());
		System.out.println("Harshit Panchal");
		
		for(int i = name.length()-1; i>=0; i--) {
			System.out.print(name.charAt(i));
		}

	}

}
