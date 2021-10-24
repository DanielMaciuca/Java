package Interfaces;

public class ByThrees implements Series, Series2 {

	int val;

	ByThrees(){

		val = 0;
	}

	public int getNext() {

		val +=3;

		return val;
	}

}
