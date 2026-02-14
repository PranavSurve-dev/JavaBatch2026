package box15Inheritance;

class battery {
	void power() {
		System.out.println("I have power ");
	}
}

class Engine extends battery {
	void oil() {
		System.out.println("Engine life");
	}
}

public class Car {
	public static void main(String[] args) {

		Engine e1 = new Engine();
		e1.power();
		e1.oil();

	}
}