package box7Array;

//WAJP to find sum of even element in an array.
public class SumOfEvenElement {
	public static void main(String[] args) {
		int[] arr = { 15, 25, 30, 40, 60, 55, 75, 20 };
		int sum = 0;

		for (int i = 0; i < arr.length; i++) {
			if (i % 2 == 0) {
				sum = sum + arr[i];

			}
		}
		System.out.println("Total even sum is " + sum);
	}
}
