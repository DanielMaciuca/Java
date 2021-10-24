package CallMethodByValueOrReference;

public class MainPerson {

	public static void main(String[] args) {
		
		// we only have 1 object created with new keyword
		Person person1 = new Person("John", 20);

		// only the reference with the address is declared
		Person person2;

		/* the value from person 1 (which is an address) 
		 * is assigned to person 2*/
		person2 = person1;

		/* at this point we have variable references
		 * which point to the same value
		 * which is actually the address of the object itself */

		/* this actually changes the attributed of 
		 * original OBJECT*/
		person2.changeDetails("Mary", 55);

		System.out.println(person1);


	}

}
