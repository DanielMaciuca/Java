package Stuff;

// daca nu am constructor sa sa imi afiseze 100
// daca am constuctor imi afiseaza 5, ceea ce e ok
// cumva vede atributul x declarat si nu mai cere declarare in metoda random

class Demo{

	// attribute
	int x = 100;

	Demo(){

		x = 5;
	}

	public void random() {

		x = 10;

		System.out.println(x);


	}

}

public class Interesant {

	public static void main(String[] args) {

		Demo d = new Demo();

		System.out.println(d.x);

		d.random();



	}

}
