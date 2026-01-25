package box1OP;

public class UnaryOP {
	 public static void main(String[] args) {
		 //Post Increment
		int a = 20;
		int b = a++;
		
		System.out.println(a);
		System.out.println(b);
		System.out.println("-----------------------");
		
		//Pre Increment
		int m = 40;
		int n =++m;
		
		System.out.println(m);
		System.out.println(n);
		System.out.println("----------------------");
		
		//Post Decrement
		int i = 15;
		int j = i--;
		
		System.out.println(i);
		System.out.println(j);
		System.out.println("---------------------------");
		
		//Pre Decrement
		int x = 8;
		int y = --x;
		
		System.out.println(x);
		System.out.println(y);
		System.out.println("---------------------------");
		
	}
}
