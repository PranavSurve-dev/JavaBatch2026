package box9Object;

//HW
class people {
	static String n = "pranav";
	int a = 22;
	double h = 6.0;

	void info() {
		System.out.println("My name is " + n + " age is " + a + " and Height is " + h);
	}
}

public class Human {
	public static void main(String[] args) {
		System.out.println("Main Start");
		people p1 = new people();
		people p2 = new people();
		p1.n = "surve";
		p1.info();
		p2.info();

		System.out.println("Main End");
	}
}
