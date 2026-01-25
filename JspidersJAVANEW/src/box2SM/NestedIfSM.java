package box2SM;

//Nested if Statement
public class NestedIfSM {
	public static void main(String[] args) {
		String email = "pranavsurve444@gmail.com";
		int pass = 123456;

		if (email == "pranavsurve444@gmail.com")
			if (pass == 123456) {
				System.out.println("login successful");
			} else {
				System.out.println("Incorrect Password");
			}
		else {
			System.out.println("invalid gmail id");
		}
		System.out.println("________________________________________________");

		int a = 1000;
		int b = 2000;
		int c = 300;

		if (a > b)
			if (a > c) {
				System.out.println(a + " is largest");
			} else {
				System.out.println(c + " is largest");
			}
		else {
			if (b > c) {
				System.out.println(b + " is largest");
			} else {
				System.out.println(c + " is largest");
			}
		}

	}
}
