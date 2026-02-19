package box15Inheritance;

//COnstructor Chaining
class person extends Object {
	String name;
	int age;
	char gen;

	public person(String name, int age, char gen) {
		this.name = name;
		this.age = age;
		this.gen = gen;
		System.out.println("A...inside person constructor");
	}
}

class student extends person {
	int roll;
	double per;
	String collage;

	public student(String name, int age, char gen, int roll, double per, String collage) {
		super(name, age, gen);
		this.roll = roll;
		this.per = per;
		this.collage = collage;
		System.out.println("B...inside student constructor");
	}

}

class Employee extends person {
	int empid;
	double sal;
	String Designation;

	public Employee(String name, int age, char gen, int empid, double sal, String designation) {
		super(name, age, gen);
		this.empid = empid;
		this.sal = sal;
		this.Designation = designation;
		System.out.println("C...inside employee constructor ");
	}
}

public class Sonytv {
	public static void main(String[] args) {
		System.out.println("Sony Start");
		person p1 = new person("pranav", 22, 'M'); // person object
		System.out.println("------------------");

		student s1 = new student("pranav", 22, 'M', 10, 7.5, "BRHC"); // student object

		System.out.println("------------------");

		Employee e1 = new Employee("surve", 23, 'M', 500, 5.5, "developer");
		System.out.println("------------------");
		System.out.println("Sony End");
	}
}
