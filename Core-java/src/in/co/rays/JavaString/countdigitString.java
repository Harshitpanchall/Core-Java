package in.co.rays.JavaString;

public class countdigitString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name = "ab1234";
		int count = 0;
		
		for(int i = 0; i < name.length(); i++) {
			char ch = name.charAt(i);
			
			if(Character.isDigit(ch)) {
				count++;
			}
		}
		System.out.println(count);

	}

}
