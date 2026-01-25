package box6Mtds;

//WAJP to find n natural number using methods.
//with return type and with parameter
public class Type4a {
	public static int naturalsum(int num) {
		int sum = 0;
		for (int i = 1; i <= num; i++) {

			sum = sum + i;
		}

		return sum;
	}

	public static void main(String[] args) {
		int n = 10;

		int ans = naturalsum(n);
		System.out.println("sum of " + n + " natural num is " + ans);

	}
}
