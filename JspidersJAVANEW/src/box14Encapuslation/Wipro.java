package box14Encapuslation;

public class Wipro {
	public static void main(String[] args) {
		Employee e1 = new Employee(700, "Pranav", 85000);
		System.out.println(e1.getEmpid());
		System.out.println(e1.getName());
		e1.setName("surve");
		System.out.println(e1.getSal());
		e1.setSal(900000);
	}
}
