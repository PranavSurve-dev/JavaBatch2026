package box15Inheritance;

//Implicit Constructor call 
class champklal {
	champklal() {// Constructor-1
		System.out.println("A...Nahane ja");
	}
}

class jethalal extends champklal {
	jethalal() { // Constructor-2
		System.out.println("B...Good morning babita ji");
	}
}

class Tappu extends champklal {
	Tappu() { // Constructor-3
		System.out.println("C...inside tappu sena");
	}
}

public class TMKOC {
	public static void main(String[] args) {
		champklal c1 = new champklal();
		System.out.println("--------------------");
		jethalal j1 = new jethalal();
		System.out.println("--------------------");
		Tappu t1 = new Tappu();

	}
}
