package box2SM;

//If else if ladder Statement
public class IfElseIfLadderSM {
	public static void main(String[] args) {
		char gen = 'O';
		if (gen == 'M' || gen == 'm') {
			System.out.println("I Am a Male");
		} else if (gen == 'F' || gen == 'f') {
			System.out.println("I Am a Female");
		} else if (gen == 'O') {
			System.out.println("Different One");
		} else {
			System.out.println("Invalid Gender");
		}

		System.out.println("----------------------------------");

		int age = 70;
		if (age > 0 && age <= 5) {
			System.out.println("I Am Infant");
		} else if (age > 5 && age <= 10) {
			System.out.println("I Am Child");
		} else if (age > 10 && age <= 18) {
			System.out.println("I Am Teen");
		} else if (age > 18 && age <= 60) {
			System.out.println("I Am Adult");
		} else if (age > 60) {
			System.out.println("I Am Senior Citizen");
		} else {
			System.out.println("Invalid Age");
		}
	}
}
