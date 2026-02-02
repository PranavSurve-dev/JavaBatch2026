package box8OOPS;

import box8OOPS.HW2.bio;

class notebook {
	int a = 20; // non-static global variable

	void study() { // non-static method
		System.out.println("study done");
	}
}

class maths {
	static int c = 30; // static global variable

	static void fail() { // static method
		System.out.println("maths done");
	}

}

public class HW1 {
	int c = 10;

	void book() {
		System.out.println("HW done");
	}

	public static void main(String[] args) {
		System.out.println("Main Start");
		System.out.println(new notebook().a);// non-static variable calling
		new notebook().study();// non-static method calling
		System.out.println("---------------------------");
		System.out.println(maths.c); // static variable calling
		maths.fail();// static method calling
		System.out.println("-----------------------");
		System.out.println(new HW1().c);
		new HW1().book();
		System.out.println("-----calling from diff source file & diff class------");
		System.out.println(new HW2().x);// non-static variable calling
		new HW2().physics();// non-static method calling
		System.out.println(bio.y);// static variable calling
		bio.biology();// static method calling
		System.out.println("Main End");
	}
}
