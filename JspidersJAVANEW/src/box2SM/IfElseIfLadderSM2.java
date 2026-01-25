package box2SM;

//If else if ladder Statement
public class IfElseIfLadderSM2 {
	public static void main(String[] args) {
		char grade = 'y';

		if (grade == 'A') {
			System.out.println("Excellent");
		} else if (grade == 'B') {
			System.out.println("Good");
		} else if (grade == 'C') {
			System.out.println("Average");
		} else if (grade == 'D') {
			System.out.println("Fail");
		} else {
			System.out.println("Invalid Gender");
		}
	}
}
