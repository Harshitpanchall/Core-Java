package in.co.rays.basic;

public class TestArray {
	public static void main(String[] args) {

		int[] a = { 5, 10, 15, 20, 25 };

		System.out.println("Lenth of this array " + a.length);
		System.out.println(a[0] + ", " + a[1] + ", " + a[2] + ", " + a[3] + "," + a[4]);
		System.out.println(a[0] + a[1] + a[2] - a[3]);

		System.out.println("--------------------------");

		for (int i = 0; i < a.length; i++) {
			System.out.println(i + "=" + a[i]);

		}
	}

}
