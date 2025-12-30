package in.co.rays.java.ops;

//class Structure///
class Employee {
	private String name;
	private int age;
	private int time;
	private String attendance;
	
	// constructor//
	Employee(String n, int a, int t, String at){
		name = n;
		age = a;
		time = t;
		attendance = at;
	}
	// function call
	
	void showDetails() {
		System.out.println("............Employee Details.............");
		System.out.println("name : " + name);
		System.out.println("age : " + age);
		System.out.println("time : " + time);
		System.out.println("attendance : " + attendance);
		
	}
}
public class Emp {

	public static void main(String[] args) {
		/// object ////
		
		Employee e1 = new Employee("Harshit",23,6,"A");
		Employee e2 = new Employee("Rita",22,5,"p");
		Employee e3 = new Employee("Harsh",20,4,"p");
		Employee e4 = new Employee("Anup",24,8,"A");
		Employee e5 = new Employee("utkarsh",26,9,"A");
		
		e1.showDetails();
		e2.showDetails();
		e3.showDetails();
		e4.showDetails();
		e5.showDetails();

	}

}
