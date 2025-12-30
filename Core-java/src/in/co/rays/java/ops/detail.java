package in.co.rays.java.ops;

//class Structure//

class Student {
	String name;
	int age;
	int marks ;
	int date;
	
	//constructor//
Student(String n, int a, int m){
	name = n;
	age = a;
	marks = m;
	
}

 //function
String CalculateGrade() {
	if(marks>= 90)  return "A";
	else if(marks>=75) return "B";
	else if(marks>= 56) return "c";
	else return "fail";
	}

//call
void showDetails() {
	System.out.println("......details........");
	System.out.println("name :"+ name);
	System.out.println("age :"  + age);
	System.out.println("marks :"  + marks);
	System.out.println("grade :" + CalculateGrade());
	System.out.println(".......................");
	
	}
}

public class detail {

	public static void main(String[] args) {
		
		///object///
		Student s1 = new Student("harshit",20,97);
		Student s2 = new Student("nikita",23,47);
		Student s3 = new Student("anuroop",22,57);
		
		s1.showDetails();
		s2.showDetails();
		s3.showDetails();	

	}

}
