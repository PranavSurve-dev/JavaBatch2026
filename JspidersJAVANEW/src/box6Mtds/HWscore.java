package box6Mtds;

//WAJP to find Average Score of Rohit sharma of 3 cricket matches
public class HWscore {
	public static void shana(double a, double b, double c) {

		System.out.println("Shana start");
		double res = (a + b + c) / 3;
		System.out.println("Sum is " + res);
		System.out.println("Shana End");
	}

	public static void main(String[] args) {
		System.out.println("Main Start");
		shana(76, 89, 80);
		System.out.println("--------------------");
		shana(90, 94, 82);
		System.out.println("______________________");
		shana(100, 77, 88);
		System.out.println("**********************");

		System.out.println("Main End");

	}

}
