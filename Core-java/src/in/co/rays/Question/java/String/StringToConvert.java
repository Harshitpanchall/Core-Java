package in.co.rays.Question.java.String;

public class StringToConvert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name = "Harshit Panchal";
		 char[] ch = name.toCharArray();
		 
		 for( int i = ch.length-1; i >= 0; i--) {
			 System.out.print(ch[i]);
		 }
		 
		}

	
}
