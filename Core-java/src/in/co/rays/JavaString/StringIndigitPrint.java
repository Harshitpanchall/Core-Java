package in.co.rays.JavaString;

public class StringIndigitPrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name = "a1b2c3d4";
		String result = "";
		
		for(int i = 0; i< name.length(); i++) {
			char ch = name.charAt(i);
			
			if(Character.isDigit(ch))
				result = result + ch;
		}
		
System.out.println(result);
	}
	
	

}
