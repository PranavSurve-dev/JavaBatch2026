package progrmas;

public class PrimeUsingMethod {

	// Method to check prime
	static boolean isPrime(int num) {

		if (num <= 1) {
			return false;
		}

		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0) {
				return false; // Not prime
			}
		}

		return true; // Prime
	}

	public static void main(String[] args) {

		int number = 17;

		if (isPrime(number)) {
			System.out.println(number + " is Prime Number");
		} else {
			System.out.println(number + " is Not Prime Number");
		}
	}
}