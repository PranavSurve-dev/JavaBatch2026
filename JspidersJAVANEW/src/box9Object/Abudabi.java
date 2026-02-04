package box9Object;

//Create an Entity(class) called as Ferrari world. Declared 3 attribute(variables) color,milage ,speed
//-Create a method to print the information of the car 
//-Create another Entity called as Abudabi create 3 object of ferrari and print the details.

class Ferrari {
	static String model = "F40"; // static global variable
	String c = "red"; // non-static global variable
	double mil = 8;// non-static global variable
	int s = 420;// non-static global variable

	void info() {
		System.out.println("Ferrari model no is " + model);
		System.out.println("Ferrari color is " + c);
		System.out.println("Ferrari milage is " + mil);
		System.out.println("Ferrari speed is " + s);
	}
}

public class Abudabi {
	public static void main(String[] args) {
		System.out.println("Main Start");

		Ferrari f1 = new Ferrari(); // object 1
		Ferrari f2 = new Ferrari(); // object 2
		Ferrari f3 = new Ferrari(); // object 3
		f1.c = "purple";
		f2.model = "GTO30"; // this is static global variable thats why it will change in every object
		f2.s = 500;
		System.out.println("------------------------------");
		f1.info();
		System.out.println("-------------------------");
		f2.info();
		System.out.println("Main End");

		// Static members have single copy in the memory hence if we modify it once
		// it will get modified everywhere(GTO30)
	}
}
