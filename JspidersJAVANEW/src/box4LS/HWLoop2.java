package box4LS;

//WAJP to print odd no. from 50 to 80 usinf while and do-while loop
public class HWLoop2 {
	public static void main(String[] args) {
//		int i = 51;
//		while (i <= 80) {
//
//			System.out.println(i);
//			i += 2;
//		}
//
//		System.out.println("-----------------------------");
//		int i1 = 51;
//		do {
//			System.out.println(i1);
//			i1 += 2;
//		} while (i1 <= 80);

		int i = 50;
		while (i <= 80) {
			if (i % 2 != 0) {
				System.out.println(i);
			}
			i++;
		}

		System.out.println("----------------------");
		int i1 = 50;
		do {
			if (i1 % 2 != 0) {
				System.out.println(i1);
			}
			i1++;
		} while (i1 <= 80);

	}
}
