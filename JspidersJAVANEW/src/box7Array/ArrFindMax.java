package box7Array;

//WAJP to find maximum element in an array. 
public class ArrFindMax {
	public static void main(String[] args) {
		int[] arr = { 30, 10, 35, 40, 50, 85, 90, 75, 82, 89 };
		int max = arr[0];

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.println("Maximum element is " + max);
	}
}
