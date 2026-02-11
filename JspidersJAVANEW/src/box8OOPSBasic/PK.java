package box8OOPSBasic;

class RaOne { // diff class same source file
	int i = 500; // non-static global variable

	void fight() { // non-static method
		System.out.println("Fighting...");
	}
}

public class PK {
	int p = 135;// non-static global variable

	void comedy() { // non-static method
		System.out.println("char kadam");
	}

	public static void main(String[] args) {

		System.out.println("pk start");
		System.out.println(new RaOne().i);// 500
		new RaOne().fight();// Fighting...
		System.out.println("------------");
		System.out.println(new PK().p);
		new PK().comedy();
		System.out.println("--------------");
		System.out.println(new DDLJ().d);
		new DDLJ().sing();
		System.out.println("PK END");
	}
}
