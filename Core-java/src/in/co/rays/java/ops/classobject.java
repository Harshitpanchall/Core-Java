package in.co.rays.java.ops;

// class Structure//
class Pen{
	String color;
	String type;
	
	// function//
	
	public void writen() {
		System.out.println("written something");
	}

	///print
	
	public void Printcolor() {
		System.out.println(this.color);
	}
}
public class classobject {
	public static void main(String[] args) {
		Pen pen1 = new Pen();
		pen1.color = "blue";
		pen1.type = "billpen";
		
		Pen pen2 = new Pen();
		pen2.color = "black";
		pen2.type = "gelpen";
		
		pen1.writen();
		pen1.Printcolor();
		pen2.Printcolor();
		
		
		

	}

}
