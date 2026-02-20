package box15Inheritance;

class champklal2 {// Explicit constructor call
	champklal2(char ch) { // constructor-1
		System.out.println(ch + "A...Nahane ja");
	}
}

class jethalal2 extends champklal2 {
	jethalal2(int a, int b) { // Constructor-2
		super('J');
		System.out.println(a + " " + b + " " + "B...Good morning babita ji");
	}
}

class Tappu2 extends champklal2 {
	Tappu2(String s) { // Constructor-3
		super('T');
		System.out.println(s + "C...inside tappu sena");
	}
}

public class TMKOC2 extends Object {
	public static void main(String[] args) {
		System.out.println("Tmkoc start");
		Tappu2 t1 = new Tappu2("tmkoc");
		jethalal2 j1 = new jethalal2(750, 200);
		System.out.println("Tmkoc end");
	}
}
