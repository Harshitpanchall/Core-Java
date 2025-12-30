package in.co.rays.JavaString;

public class StringImmutable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "Harshit Panchal";
		
		System.out.println(name);
		System.out.println(name.replace('h','s'));
		System.out.println(name);
		
		
		System.out.println(".............................");
		
		StringBuffer sb = new StringBuffer("SunilSahu");
		System.out.println(sb);
		System.out.println(sb.append("Hello"));
		System.out.println(sb);

	}

}
