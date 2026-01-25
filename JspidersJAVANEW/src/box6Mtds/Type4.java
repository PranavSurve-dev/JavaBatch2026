package box6Mtds;
//With return type with parameter method...

//import java.util.Scanner;

public class Type4 {
	public static double area(double r) {

		double res = 3.142 * r * r;
		return res;
	}

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the radius of pizza ");
//		double r = sc.nextDouble();

		double res = area(150);
		System.out.println("Area of pizza " + res);

		if (res <= 100) {
			System.out.println("small size pizza");
		} else if (res > 100 && res <= 200) {
			System.out.println("medium size of pizza");
		} else if (res >= 200) {
			System.out.println("large size of pizza ");
		} else {
			System.out.println("invalid");
		}

	}
}