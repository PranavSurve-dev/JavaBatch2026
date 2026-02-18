package box15Inheritance;

class father {
	void gold() { // parent class , super class
		System.out.println("10kg Gold");
	}
}

class Abhijit extends father { // sub class , child class
	void ganja() {
		System.out.println("Ganja Fukna");
	}
}

public class PapaMeriJaan {
	public static void main(String[] args) { // sub class , child class - Object

		Abhijit a1 = new Abhijit();
		a1.gold();
		a1.ganja();
		System.out.println("----------------------");

		father f1 = new father(); // parent class , super class - Object
		f1.gold();
		// f1.ganja();// CTE
	}
}
