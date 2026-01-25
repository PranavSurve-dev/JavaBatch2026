package box6Mtds;

//WAJP to find area of traingle (1/2*b*h)
public class HWTriangle {
	public static void area(double b, double h) {

		double res = 3.142 * b * h;
		System.out.println("Area is " + res);
	}

	public static void main(String[] args) {

		area(2, 4);
		area(3, 4);
		area(1, 3);
	}
}
