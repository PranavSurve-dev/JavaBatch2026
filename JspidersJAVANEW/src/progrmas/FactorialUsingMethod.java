package progrmas;

public class FactorialUsingMethod {

	static int factorial(int num) {

		int fact = 1;

		for (int i = 1; i <= num; i++) {
			fact = fact * i;
		}

		return fact;
	}

	public static void main(String[] args) {

		int number = 6;
		System.out.println("Factorial is: " + factorial(number));
	}
}