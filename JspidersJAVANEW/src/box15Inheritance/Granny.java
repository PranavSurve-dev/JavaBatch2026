package box15Inheritance;

//Multilevel Inheritance
class Granny {
	void pyar() {
		System.out.println("Dadi ka pyar");
	}
}

class mom extends Granny {
	void care() {
		System.out.println("Mother Caring");
	}
}

class beti extends Granny {
	void kalesh() {
		System.out.println("Shopping.......");
	}
}
