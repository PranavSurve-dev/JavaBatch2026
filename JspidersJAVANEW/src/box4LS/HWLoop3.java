package box4LS;

//WAJP to print no. which are divisible by 6 from 100 to 130
public class HWLoop3 {
	public static void main(String[] args) {
		int i = 100;
		while (i <= 130) {
			if (i % 2 == 0)
				System.out.println(i);
			i++;
		}

		System.out.println("--------------------");

		int i1 = 100;
		do {
			if (i1 % 2 == 0)
				System.out.println(i1);
			i1++;
		} while (i1 <= 130);
	}
}
