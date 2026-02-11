package box8OOPSBasic;

public class OOPs4 {

	static String s1 = ColorName();
	static int a = 10;
	static String s = fruitname();

	public static void main(String[] args) {

		System.out.println("main start");
		System.out.println(a);
		System.out.println(s);
		System.out.println("Main end");
	}

	public static String fruitname() {
		System.out.println("Method start");
		System.out.println(a);
		System.out.println(s);
		System.out.println("Method End");
		return "Orange";
	}

	public static String ColorName() {
		System.out.println("Method start2");
		System.out.println(a);
		System.out.println(s);
		System.out.println("Method End2");
		return "RED";
	}

}