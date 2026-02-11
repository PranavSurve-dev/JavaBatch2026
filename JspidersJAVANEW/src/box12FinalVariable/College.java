package box12FinalVariable;

//HW...................................DONE.
class student {
	String name;
	int marks;
	final long prn;

	static int no = 100;

	public student(String name, int marks) {

		this.name = name;
		this.marks = marks++;
		this.prn = no++;
	}

	void details() {
		System.out.println("Student name is " + name + " obtained marks is " + marks + " PRN No. Is " + prn);
	}
}

public class College {
	public static void main(String[] args) {

		student s1 = new student("pranav", 80);
		s1.details();
		System.out.println("----------------");
		student s2 = new student("saras", 50);
		s2.details();
		System.out.println("----------------");
		student s3 = new student("Amit", 70);
		s3.details();
		System.out.println("----------------");
		student s4 = new student("Amit", 70);
		s4.details();
	}
}
