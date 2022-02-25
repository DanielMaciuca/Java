package Interfaces;

public class Implements_AA {

	public static void main(String[] args) {		

		Imp myobject = new Imp();

		myobject.myMehtod();		

	}

}

class Imp implements AA{


	@Override
	public void myMehtod() {		

		System.out.println("Test");

		System.out.println(a);


	}


}