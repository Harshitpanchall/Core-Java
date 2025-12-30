package in.co.rays.JavaString;

public class StringCountInjava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "123";
		int count = 0;
		
		
		for( int i =0; i<str.length(); i++) {
			char ch = str.charAt(i);
			
			
			
			if(Character.isDigit(ch)) {
				count++;
				
			
			}
		
		}
System.out.println(count);

	}
	

}
