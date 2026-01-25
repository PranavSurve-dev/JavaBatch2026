package box6Mtds;

public class PrimeNO {
	public static boolean isprime(int num) {
		if (num <= 1) {
			return false;
		}
		for (int i = 2; i <= Math.sqrt(num); i++) {
			if (num % i == 0) {
				return false;
			}
			// return true;
		}
		return true;
	}

	public static void main(String[] args) {
		int n = 13;
		if (isprime(n)) {
			System.out.println(n + " is prime no ");
		} else {
			System.out.println(n + " is not prime no  ");
		}

	}
}
