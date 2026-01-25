package box4LS;

public class DoWhileloopLS {
	public static void main(String[] args) {
		// WAJP to print 1 to 10 using do-while loop
		int i = 1;
		do {
			System.out.println(i);
			i++;
		} while (i <= 10);
		System.out.println("--------------------");
//WAJP to print no. from 20 to 1 using do while loop
		int i1 = 20;
		do {
			System.out.println(i1);
			i1 -= 2;
		} while (i1 >= 1);
		System.out.println("-------------------------");

		int i2 = 20;
		do {
			if (i % 2 == 0) {
				System.out.println(i2);
			}
			i2++;

		} while (i2 <= 30);

		// WAJP to print no. which is divisible by 4 from 10 to 40

		int i3 = 10;
		do {
			if (i3 % 4 == 0) {
				System.out.println(i3);
			}
			i3++;
		} while (i3 <= 40);
	}
}
