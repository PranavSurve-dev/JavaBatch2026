package box2SM;

//If else Statement
public class IfelseSM {
	public static void main(String[] args) {
		int age = 10;
		if (age >= 21) {
			System.out.println("Eliglible For Marriage");
		} else {
			System.out.println("Have patience Abhi tu bacha hya");
		}
		System.out.println("------------------------------------");

		int price = 999;
		int bal = 1500;

		if (price <= bal) {
			System.out.println("I have a money");
		} else {
			System.out.println("No money");
		}
		System.out.println("--------------------------");

		int num = 51;

		if (num % 2 == 0) {
			System.out.println(num + " is even no.");
		} else {
			System.out.println(num + " is odd no.");
		}
	}
}
