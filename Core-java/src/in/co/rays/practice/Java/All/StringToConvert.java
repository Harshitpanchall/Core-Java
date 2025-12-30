package in.co.rays.practice.Java.All;

public class StringToConvert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		///string to conerted //
		
		/// char[] ch = name.tocharArray();//
		
		String name = "harshit Panchal";
		char[] ch = name.toCharArray();
		for(int i = ch.length-1; i>0; i--) {
			System.out.print(ch[i]);
		}

}
}
