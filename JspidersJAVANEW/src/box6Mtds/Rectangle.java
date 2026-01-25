package box6Mtds;

//WAJP to find perimeter of rectangle using methods. P=2(l*W)
public class Rectangle {
	public static void peri(double l, double w) {

		double res = 2 * (l * w);
		System.out.println("Perimeter of rectangle is " + res);
	}

	public static void main(String[] args) {

		peri(10, 12);
		peri(2, 4);
	}
}
