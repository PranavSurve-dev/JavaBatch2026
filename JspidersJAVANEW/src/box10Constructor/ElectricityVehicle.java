package box10Constructor;

//Create an Entity called as OLA Declared an initialize 3 attributes [color,battery capacity,milage]
//create a method to print the Details 
//Create another Entity called as Electricity Vehicle Create 3 object of OLA an print the details
class OLA {
	String color = "Black";
	double Bcap = 200;
	int mil = 40;

	void details() {
		System.out.println("OLA Color " + color + " OLA Bcap " + Bcap + " OLA mil " + mil);
	}
}

public class ElectricityVehicle {
	public static void main(String[] args) {
		System.out.println("Main Start");
		OLA o1 = new OLA(); // object 1
		OLA o2 = new OLA();// object 2
		OLA o3 = new OLA();// object 3
		o1.details();
		o2.details();
		o3.details();

		System.out.println("Main End");
	}
}
