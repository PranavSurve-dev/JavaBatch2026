package box7Array;

//WAJP to find sum of all element in an array.
public class SumOfAllElement {
	public static void main(String[] args) {
		int[] arr = { 15, 25, 30, 40, 60, 55, 75, 20 };
		int sum = 0;

		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
		}
		System.out.println("Total sum is " + sum);
	}

}
