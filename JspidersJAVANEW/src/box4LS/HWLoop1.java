package box4LS;

import java.util.Scanner;

/*WAJP to print table of any no. using while
& do-while loop and  scanner class*/

public class HWLoop1 {
	public static void main(String[] args) {

//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter A No. For Table");
//
//		int num = sc.nextInt();
//		int i = 1;
//		while (i <= 10) {
//			System.out.println(num + "X" + i + "=" + num * i);
//			i++;
//		}

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter A No. For Table by DO while");
		int num = sc.nextInt();
		int i = 1;
		do {
			System.out.println(num + "X" + i + "=" + num * i);
			i++;
		} while (i <= 10);

	}
}
