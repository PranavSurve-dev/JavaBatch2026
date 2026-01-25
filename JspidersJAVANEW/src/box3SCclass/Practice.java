package box3SCclass;

import java.util.Scanner;

public class Practice {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st Number ");
		int a = sc.nextInt();
		System.out.println("Enter 2st Number ");
		int b = sc.nextInt();
		System.out.println("Enter 3st Number ");
		int c = sc.nextInt();
		System.out.println("--------------------------");

		if (a > b) {
			if (a > c) {
				System.out.println(a + " is largest");
			} else {
				System.out.println(c + " is largest");
			}
		} else {
			if (b > c) {
				System.out.println(b + " is largest");
			} else {
				System.out.println(c + " is largest");
			}
		}

	}
}
