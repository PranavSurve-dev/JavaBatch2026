package box3SCclass;

import java.util.Scanner; //step 1
//Scanner class

public class NEWScanner {
	public static void main(String[] args) {
		System.out.println("main start");
		Scanner sc = new Scanner(System.in); // step 2
		System.out.println("Enter your name");
		String name = sc.next();

		System.out.println("Enter your Age");
		int age = sc.nextInt();

		System.out.println("Enter your Gender");
		char gen = sc.next().charAt(0);

		System.out.println("______________________-");
		System.out.println("name is " + name);
		System.out.println("age is " + age);

		System.out.println("gen is " + gen);

		System.out.println("main end");
	}
}
