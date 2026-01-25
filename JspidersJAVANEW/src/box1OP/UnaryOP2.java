package box1OP;

public class UnaryOP2 {
	public static void main(String[] args) {
		//Post Increment
		int a = 20;
		int b = a++;
		System.out.println("A value is "+a);
		System.out.println("B value is "+b);
		System.out.println("-----------------------------");
		
		//Pre Increment
		int m = 40;
		int n = ++m;
		System.out.println("M value is "+m);
		System.out.println("n value is "+n);
		System.out.println("-----------------------------");
		
		//Post Decrement
		int i = 15;
		int j = i--;
		System.out.println("i value is "+i);
		System.out.println("j value is "+j);
		System.out.println("-----------------------------");
		
		
		int x = 8;
		int y = --x;
		System.out.println("x value is "+x);
		System.out.println("y value is "+y);
		System.out.println("-----------------------------");
	}
}
