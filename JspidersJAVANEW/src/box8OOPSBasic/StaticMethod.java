package box8OOPSBasic;

public class StaticMethod {
	public static void play() {
		System.out.println("Cat is playing");
	}

	public static void main(String[] args) {
		System.out.println("Hello cat World");
		play();
		StaticMethod2.sing();
		// test();//CTE
	}

}
