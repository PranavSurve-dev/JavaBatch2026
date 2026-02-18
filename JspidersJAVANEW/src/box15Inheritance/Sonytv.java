package box15Inheritance;

//COnstructor Chaining
class person {
	String name;
	int age;
	char gen;

	public person(String name, int age, char gen) {
		this.name = name;
		this.age = age;
		this.gen = gen;
		System.out.println("A....inside person constructor");
	}
}

class student extends person {
	int roll;
	double per;

	public student(String name, int age, char gen, int roll, double per, String collage) {
		super(name, age, gen);
		this.roll = roll;
		this.per = per;
		this.collage = collage;
	}

	String collage;

}

public class Sonytv {
	public static void main(String[] args) {

	}
}
