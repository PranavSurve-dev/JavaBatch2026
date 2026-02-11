package box11Blocks;

public class Capgemini {
	{ // Non-static block-1
		System.out.println("A---Abhijit loves Siddhi");
	}

	{ // Non-static block-2
		System.out.println("B---Siddhi loves Jay");
	}

	public static void main(String[] args) {
		System.out.println("Main Start");

		Capgemini c1 = new Capgemini(); // object-1
		System.out.println("------------");
		Capgemini c2 = new Capgemini(); // object-2
		System.out.println("------------");
		Capgemini c3 = new Capgemini(); // object-3

		// Non-Static block runs when object is created

		System.out.println("Main End");
	}

	{ // Non-static block-3
		System.out.println("C---Jay Loves Rupa");
	}

}
