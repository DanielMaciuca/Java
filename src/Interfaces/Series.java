package Interfaces;

public interface Series {
	
	/*Variables in the interface are public/static/final.
	 * This means they can be accessed by other classes
	 * and can be used without creating an object*/
	
	 int Max = 20;
	
	String ERRORMSG = "Cannot go above the value of " + Max;
	
	int getNext();
}
