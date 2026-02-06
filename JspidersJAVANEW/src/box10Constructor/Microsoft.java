package box10Constructor;

//this Keyword
class window {
	String ver; // non-static global variable
	int speed;
	double size;

	public window(String ver, int speed, double size) {
		System.out.println("this keyword contains " + this);
		this.ver = ver;
		this.speed = speed;
		this.size = size;
	}

	void mahiti() { // non-static method
		System.out.println("Softaware version is " + ver + " Speed is " + speed + " App size is " + size);
	}

}

public class Microsoft {
	public static void main(String[] args) {
		System.out.println("main start");
		window w1 = new window("w12", 6000, 2.1);
		System.out.println("w1 contains " + w1);
		w1.mahiti();
		System.out.println("------------------");

		window w2 = new window("w12", 8000, 8.1);
		System.out.println("w1 contains " + w2);
		w2.mahiti();
		System.out.println("main End");
	}
}
