package progrmas;

public class AreaOfCircle {

	// Method to calculate area
	public static double calculateArea(double radius) {
		double area = 3.14 * radius * radius;
		return area;
	}

	public static void main(String[] args) {
		double r = 5; // radius
		double result = calculateArea(r);

		System.out.println("Radius: " + r);
		System.out.println("Area of Circle: " + result);
	}
}