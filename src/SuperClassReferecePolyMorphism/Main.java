package SuperClassReferecePolyMorphism;

public class Main {

	public static void main(String[] args) {
		
		Person p1 = new Person();
		
		Student s1 = new Student();
		
		/* the reference variable of superclass type can 
		 * point to a NEW object of subclass */
		Person p3 = new Student();
		
		/* the reference variable of superclass type can
		 * point to an existing object of subclass */
		Person p4 = s1;

	}

}
