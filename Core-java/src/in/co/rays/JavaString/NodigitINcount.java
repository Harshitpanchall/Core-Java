package in.co.rays.JavaString;

public class NodigitINcount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name = "Hello";
		String result = "no digit";
		int count  = 0;
		
		for(int i = 0; i < name.length(); i++) {
			char ch = name.charAt(i);
			
			if(Character.isDigit(ch)) {
				result = result + ch;
				count++;
		
			}
		
		}
		System.out.println(result + count);
	}

}
