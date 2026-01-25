package box7Array;

public class Arr1 {
	public static void main(String[] args) {

		int[] num; // 1.Array Declaration
		num = new int[10]; // 2.Array Creation

		int[] arr = new int[6];// 3.Array declaration and creation

		System.out.println(arr[0]);// 0
		System.out.println(arr[1]);// 0
		System.out.println(arr[2]);// 0
		System.out.println(arr[3]);// 0
		System.out.println(arr[4]);// 0
		System.out.println(arr[5]);// 0

		// System.out.println(arr[6]); //ArrayIndexOutOfBoundsException
		System.out.println("------------------------");

		String[] fruits = new String[4];// 3.Array declaration and creation
		fruits[1] = "mango"; // 4.Array initilization
		fruits[0] = "apple";

		System.out.println(fruits[0]);// apple
		System.out.println(fruits[1]);// mango
		System.out.println(fruits[2]);// null
		System.out.println(fruits[3]);// null

		System.out.println("---------------------");

		char[] ch = { 'a', 'h', '@', 'h', 'y' };// 5.Array declaration and initilization
		System.out.println(ch[0]);// a
		System.out.println(ch[4]);// y

		System.out.println("-----------------------");

		int[] a1 = { 12, 23, 45, 56, 87, 98 }; // 5.Array declaration and initilization
		System.out.println(a1[0]); // 12
		System.out.println(a1[1]);// 23
		System.out.println(a1[2]);// 45
		System.out.println(a1[3]);// 56
		System.out.println(a1[4]);// 87
		System.out.println(a1[5]);// 98

	}
}