package box1OP;

public class UnaryOP3 {
	public static void main(String[] args) {

		int a = 10;
		int b = a++ + ++a + a++;

		System.out.println(a);
		System.out.println(b);
		System.out.println("----------------------------");

		int i = -5;
		int j = i-- - --i - i--;
		System.out.println(i);
		System.out.println(j);
	}
}
