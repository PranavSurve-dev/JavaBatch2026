package box4LS;

import java.util.Scanner;

public class Forloop3 {
	public static void main(String[] args) {
		for (int i = 1, j = 65; i <= 26 && j <= 90; i++, j++) {
//			System.out.println(i + " -> " + (char) j + " -> " + j);
		}
		System.out.println("------------------------");

		int n = 1;
		for (int i = 65; i <= 90; i++) {
//			System.out.println(n + " ->" + (char) i + " ->" + i);
		}
		System.out.println("---------------------");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a num to print table");
		int num = sc.nextInt();

		for (int i = 1; i <= 10; i++) {
			System.out.println(num + " X " + i + " = " + num * i);
		}

	}
}
