package box6Mtds;

//WAJP to find n natural number using methods.
//without return type with parameter.
public class Type2a {
	public static void natural(int num) {
		int sum = 0;

		for (int i = 1; i <= num; i++) {
			sum = sum + i;
		}
		System.out.println("sum of " + num + " natural num is " + sum);
	}

	public static void main(String[] args) {

		natural(10);
		natural(15);
		natural(50);
	}
}
