package Interfaces;

public class ByTwos implements Series, Series2 {

	int val;

	ByTwos(){

		val = 0;
	}


	   public int getNext() {

		val +=2;

		return val;
	}

}
