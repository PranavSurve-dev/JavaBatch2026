package box13AccSpeci;

//Different Class Same Package
public class Golmaal {
	public static void main(String[] args) {
		System.out.println("Golmaal start");

		War g1 = new War();
		System.out.println(g1.a);
		System.out.println(g1.b);
		System.out.println(g1.c);
//		System.out.println(g1.d);  //CTE //Private

		g1.fight1();
		g1.fight2();
		g1.fight3();
//		g1.fight4(); / CTE //Private
		System.out.println("Golmaal end");
	}
}
