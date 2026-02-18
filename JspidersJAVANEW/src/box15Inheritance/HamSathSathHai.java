package box15Inheritance;

//Multilevel Inheritance
public class HamSathSathHai {
	public static void main(String[] args) {
		beti b1 = new beti();// sub class object-1
		b1.pyar();
//		b1.care();
		b1.kalesh();
		System.out.println("---------------------");
		mom m1 = new mom();// sub class object - 2
		m1.pyar();
		m1.care();
//		m1.kalesh();
		System.out.println("-----------------------");
		Granny g1 = new Granny();
		g1.pyar();

	}
}
