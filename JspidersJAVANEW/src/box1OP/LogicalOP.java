package box1OP;

//Logical operator
public class LogicalOP {
	public static void main(String[] args) {

		int a = 10;
		int b = 25;

		System.out.println(a > b || 'A' == 65); // true
		System.out.println("jay" != "komal" && 50 < 80);// true
		System.out.println(true && false);// false
		System.out.println(true || false);// true
		System.out.println(true != true);// false
		System.out.println("-----------------------");
		System.out.println("pranav" == "surve" && 80 == 90);// false
		System.out.println('A' == (70 - 5) || (5 * 5) == (20 + 5));// true
		System.out.println(true && false && false && true);// false
		System.out.println(true && true && true && true);// true
		System.out.println(false || false || true || false);// true
		System.out.println("---------------------------");
		boolean x = true;
		boolean y = false;
		boolean z = true;
		System.out.println(x && y || z);// true
		System.out.println(true && false || true);// true

		System.out.println("--------------------------");
		System.out.println(50 * 5 + 700 / 5 % 60 <= 8500 || 'A' + 100 == (50 + 115));// true
		System.out.println(70 * 5 + 750 / 35 + 1200 % 10 >= 3500 && (5 * 10) <= (20 * 2));// false
		System.out.println("--------------------------");
		System.out.println(!true);// false
		System.out.println(!('Z' == 90));// false
		System.out.println(!(100 != 100));// true
		System.out.println(!(true && false));// true
		System.out.println(false != true != true);// false
		System.out.println(!(55.55 <= 56.66 || 'A' != 100));// false

	}
}
