package box6Mtds;

//WAJP to find  virat kholi avg of 3 matchs with if else ladder
public class HWviratkholi {
	public static void virat(double a, double b, double c) {

		double res = (a + b + c) / 3;
		System.out.println("AVG of 3 matches is " + res);
	}

	public static void main(String[] args) {

		virat(93, 84, 49);
	}
}
