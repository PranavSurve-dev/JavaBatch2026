package box6Mtds;
/*WAJP to find circumference of circle using
Without return type & With Parameter. formula(2*3.142*r)  */

public class Type2 {
	public static void circle(double r) {

		double res = 2 * 3.142 * r;
		System.out.println("circumference of circle is " + res);
	}

	public static void main(String[] args) {

		circle(20);
		circle(5.4);
	}
}
