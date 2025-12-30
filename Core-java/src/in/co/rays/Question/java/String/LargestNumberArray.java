package in.co.rays.Question.java.String;

public class LargestNumberArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] name = { 23,34,54,56,77,34};
		
		int large = name[0];
		
		for(int i = 0; i < name.length; i++) {
			if(name[i] >large) {
				large = name[i];
			
			}
	
		}
		System.out.println("largest No." + large);
		
		

	}

}
