package Learning;

class Emp{

	int emp_id;
	int salary;
	static String ceo = "Nicu"; //static means it will be the same value for all objects

	public void show() {

		System.out.println(emp_id + " " + salary + " " +  ceo);
	}

	public static void test() {

		System.out.println("Static method");

	};

}

public class StaticDemo {

	public static void main(String[] args) {

		Emp mihai = new Emp();
		mihai.emp_id = 5;
		mihai.salary = 1000;
		//mihai.ceo = "Miky"; // static variables can be accessed also from an object, not recommended
		//Emp.ceo = "Miky"; // we refer to a static field using the class name
		//  the ideea is NOT to create objects for static but to have a shared value

		Emp gigi = new Emp();
		gigi.emp_id = 6;
		gigi.salary = 1200;
		
		
		mihai.show();
		gigi.show();

		//		mihai.ceo = "Miky";
		//		mihai.test();
		//
		//		Emp.ceo = "Miky2";
		//		Emp.test();





	}



}
