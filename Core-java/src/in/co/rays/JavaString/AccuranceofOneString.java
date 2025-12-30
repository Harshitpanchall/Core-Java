package in.co.rays.JavaString;

public class AccuranceofOneString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String  name = "Gooogle1234";
		String result = "";
		String os = "";
		int count = 0;
		
		for(int i = 0; i < name.length(); i++) {
			char ch = name.charAt(i);
			
			if(Character.isDigit(ch)) {
				result = result + ch;
				count++;
			}
			
			if(ch == 'o') {
				os = os + ch;
			
			}
		
		}
		
		System.out.println("count " + os);
		System.out.println("result"+" " + result + name);
		
	
	}
}


