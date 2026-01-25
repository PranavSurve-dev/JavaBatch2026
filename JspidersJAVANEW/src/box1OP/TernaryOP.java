package box1OP;

public class TernaryOP {
	public static void main(String[] args) {
		int a = 70;
		int b = 20;
		int max = (a > b) ? a : b;
		System.out.println("MAX num is " + max);
		System.out.println("-----------------------");
		System.out.println(('A' == 65) ? 786 : 420);
		String res = ("Amit" == "Amit") ? "Riya" : "priya";
		System.out.println("Result is " + res);

		System.out.println("-----------------------------");

		int x = 786;
		int y = 786;
		int ans = (x == y) ? 50 : 5;
		System.out.println(+ans);
		System.out.println("---------------------------");

	}
}
