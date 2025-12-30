package in.co.rays.Question.java.String;

public class SecondLargeArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] name = { 23,34,54,56,77,34};
		
		int secand = name[0];
		
		for(int i = 0; i < name.length; i++) {
			if(name[i] > secand) {
				secand = name[i];
				
			}
		}
		System.out.println("second large" + secand);
		
		

	}

}
