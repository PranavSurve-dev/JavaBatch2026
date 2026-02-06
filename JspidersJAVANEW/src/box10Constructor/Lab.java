package box10Constructor;

class Robot {

	String name; // non-static global variable
	double mem; //
	int speed;

	Robot(String n, double m, int s) { // constructor
		System.out.println("Constructor Start");
		name = n;
		mem = m;
		speed = s;
		System.out.println("Constructor End");
	}

	void info() {

		System.out.println("Robot Name is " + name + " memory is " + mem + " speed is " + speed);
	}
}

public class Lab {
	public static void main(String[] args) {
		System.out.println("Main Start");
		Robot r1 = new Robot("chitti", 4.5, 400);
		r1.info();
		Robot r2 = new Robot("RaOne", 7.5, 700);
		r2.info();
		System.out.println("Main End");
	}
}
