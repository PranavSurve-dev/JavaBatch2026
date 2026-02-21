package progrmas;

//public class PrimeNumber {
//	public static void main(String[] args) {
//
//		int num = 3;
//		boolean isPrime = true;
//
//		if (num <= 1) {
//			isPrime = false;
//		} else {
//			for (int i = 2; i <= num / 2; i++) {
//				if (num % i == 0) {
//					isPrime = false;
//					break;
//				}
//			}
//		}
//
//		if (isPrime)
//			System.out.println(num + " is Prime Number");
//		else
//			System.out.println(num + " is Not Prime Number");
//	}
//}

public class PrimeNumber {
	public static void main(String[] args) {

		int num = 19;
		int count = 0;

		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				count++;
			}
		}

		if (count == 2) {
			System.out.println(num + " is Prime Number");
		} else {
			System.out.println(num + " is Not Prime Number");
		}
	}
}