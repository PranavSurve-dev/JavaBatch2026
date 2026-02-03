package box8OOPS;

public class Hackthon {
	int num; // Global variable have default value concept
	String s;
	static double d;

	public static void main(String[] args) {
		System.out.println("Main Start");
		int a;// local variable do not have default value concept
//	System.out.println(a); //CTE
		System.out.println(new Hackthon().num);// 0 Default value
		System.out.println(new Hackthon().s); // null Default value
		System.out.println(Hackthon.d);// 0.0 Default value
		System.out.println("Main End");
	}
}
