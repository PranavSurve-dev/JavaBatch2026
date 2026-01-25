package box7Array;

public class Arr2 {
	public static void main(String[] args) {
		String[] burjK = { "sunil", "mia", "jay", "abhijt", "nara", "prashil", "Ankit", "komal", "pranav", "sunil",
				"mia", "jay", "abhijt", "nara", "prashil", "Ankit", "komal", "pranav" };

		System.out.println(burjK.length);// 18

		System.out.println("----------------");

		for (int i = 0; i < burjK.length; i++) {
			System.out.println(i + "-->" + burjK[i]);
		}

		double[] d1 = { 55.20, 41.20, 12.10, 78.00 };
		System.out.println(d1.length);
		for (int i = 0; i < d1.length; i++) {
			System.out.println(d1[i]);
		}

	}
}
