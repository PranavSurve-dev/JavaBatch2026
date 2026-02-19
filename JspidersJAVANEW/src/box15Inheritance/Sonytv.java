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
	String collage;

	public student(String name, int age, char gen, int roll, double per, String collage) {
		super("pranav", 22, 'm');
		this.roll = roll;
		this.per = per;
		this.collage = collage;
		System.out.println("B...inside student constructor");
	}

}

public class Sonytv {
	public static void main(String[] args) {
		person p1 = new person();
		p1.person();

		System.out.println();
	}
}
