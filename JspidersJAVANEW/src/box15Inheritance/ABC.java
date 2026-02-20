package box15Inheritance;

class fathers extends Object {
	void land() {
		System.out.println("100 acer land");
	}
}

class son extends fathers {
	void masti() {
		System.out.println("Daru pina");
	}
}

class daughter extends fathers {
	void party() {
		System.out.println("paisa udana");
	}
}

public class ABC {
	public static void main(String[] args) {
		son s1 = new son();
		s1.land();
		s1.masti();
		System.out.println("---------------");
		daughter d1 = new daughter();
		d1.land();
		d1.party();
	}
}
