package box4LS;

public class Whileloop2 {
	public static void main(String[] args) {
//WAJP to print even no. from 20 to 30 using while loop if condition
		int i = 20;
		while (i <= 30) {
			if (i % 2 == 0) {
//				System.out.println(i);
			}
			i++;
		}
		System.out.println("--------------------");
//WAJP to print no. which are Divisible by 4 from 10 to 40
		int i1 = 10;
		while (i1 <= 40) {
			if (i1 % 4 == 0) {
				System.out.println(i1);
			}
			i1++;
		}
	}
}
