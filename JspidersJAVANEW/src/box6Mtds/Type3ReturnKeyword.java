package box6Mtds;
//With return type & without parameter

public class Type3ReturnKeyword {
	public static int key() {

		return 100;
	}

	public static void main(String[] args) {

		System.out.println("main start");

		System.out.println(key()); // printing directly
		System.out.println("----------------");

		int res = key() + key(); // Store in another variable
		System.out.println("Result is " + res);

		System.out.println("main end");
	}
}
