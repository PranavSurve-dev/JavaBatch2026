package box15Inheritance;

public class sultan {
	public static void main(int n) {
		System.out.println("Main int Start");

		System.out.println("Main int End");

	}

	public static void main(String[] args) {
		System.out.println("String[] args start");
		main(55);
		main(5.5);
		System.out.println("String[] args end");
	}

	public static void main(double i) {

		System.out.println("Main double start");
		System.out.println("Main double end");
	}
}
