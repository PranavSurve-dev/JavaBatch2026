package box4LS;

// WAJP to print number from 100 to 200.
public class HWForloop {
	public static void main(String[] args) {
		for (int i = 100; i <= 200; i++) {
			System.out.println(i);
		}

		System.out.println("----------------------");
		// WAJP to print even number from 60 to 20.
		for (int i = 60; i >= 20; i -= 2) {
			System.out.println(i);
		}

		System.out.println("----------------");

		// WAJP to print number which are divisible by 7 from 100 to 150.
		for (int i = 105; i <= 150; i += 7) {
			System.out.println(i);
		}
		System.out.println("------------");

		for (int i = 100; i <= 150; i++) {
			if (i % 7 == 0) {
				System.out.println(i);
			}
		}
		// WAJP to print ODD number from 250 to 150.
		for (int i = 249; i >= 150; i -= 2) {
			System.out.println(i);
		}
		System.out.println("--------------");
		// WAJP to print number from -80 to -30.
		for (int i = -80; i <= -30; i++) {
			System.out.println(i);
		}

		System.out.println("-------------------");
		// WAJP to print number from 50 to 70 in reverse order.
		for (int i = 70; i >= 50; i--) {
			System.out.println(i);
		}
		System.out.println("------------------");
		// WAJP to print a to z.

		for (int i = 97; i <= 122; i++) {
			System.out.println((char) i);
		}
		System.out.println("-----------------");
		// WAJP to print number from Z to A.
		for (int i = 90; i >= 65; i--) {
			System.out.println((char) i);
		}

	}

}
