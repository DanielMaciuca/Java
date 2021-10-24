package ObjectAsMethodParameter;

class ceva{

	int age;
	String name;

	public void ceva_move(ceva obj) {

		obj.age = 100;
		obj.name = "update";

	}

}


public class TryObjectAsParameter {

	public static void main(String[] args) {

		ceva myobject = new ceva();

		myobject.age = 20;
		myobject.name = "Gogu";
		
		System.out.println(myobject.age + myobject.name);

		myobject.ceva_move(myobject);

		System.out.println(myobject.age + myobject.name);






	}

}
