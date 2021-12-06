package Interfaces;

public class Main {

	public static void main(String[] args) {

		ByTwos bytwos = new ByTwos();

		ByThrees bythrees = new ByThrees();
	
	
		/* This is only a variable reference of the Series interface
		 * It can point to objects from BOTH subclasses
		 * It will call which object version is pointing to 
		 * It can call only methods that are defined in the interface*/

		// this is only the declaration of a Series object that stores a reference
		Series ob;

		for (int i=0; i<5; i++) {

			//ob is a reference that now points to bytwos object (referece actually)
			ob = bytwos;

			System.out.println("ByTwos object " + ob.getNext());	

			//ob is a reference that now points to bythrees object (reference actually)
			ob = bythrees;

			System.out.println("ByThrees object" + ob.getNext());

		}

		//Max is public
		//System.out.println("Calling Max variable from interface" + bytwos.Max);

		//Max is static
		System.out.println("Calling the Max varialble without an object" + Series.Max);


	}

}
