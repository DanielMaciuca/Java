package CallMethodByValueOrReference;

public class Person {
	
	String name;
	int age;
	
	public Person (String name, int age){
		
		this.age = age;
		this.name = name;
		
	}
	
	public String toString() {
		
		return "Name " + name + "age " + age;
	}
	
	

	public void changeDetails(String name, int age) {
		
		this.age = age;
		this.name = name;
		
		
	}
}
