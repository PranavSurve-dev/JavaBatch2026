package progrmas;

public class RevStr {
	public static void main(String[] args) {

		String str = "pranav";
		String rev = "";

		for (int i = str.length() - 1; i >= 0; i--) {

			rev = rev + str.charAt(i);
		}
		System.out.println("Original String:" + str);
		System.out.println("Original String:" + rev);
	}
}
