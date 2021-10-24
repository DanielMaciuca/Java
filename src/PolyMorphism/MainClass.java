package PolyMorphism;

public class MainClass {

	public static void main(String[] args) {


		Vampire vampire = new Vampire();
		WereWolf werewolf = new WereWolf();

		/*
		 * vampire.Talk(); werewolf.Talk();
		 */

		/* the reference variable of superclass type can 
		 * point to an EXISTING object of subclass
		 * When a superclass variable contains a reference to a subclass object, 
		 * and that reference is used to call a method, 
		 * the subclass version of the method is called. */

		Enemy enemy = vampire;

		enemy.Talk();

		/* the reference variable of superclass type can
		 * point to NEW object of subclass */

		Enemy enemy2 = new Vampire();

		//enemy2.Talk();

		//an array of enemies which is the superclass
		// the array contains different types of objects of subclasses
		Enemy[] enemies = {vampire, werewolf};
		enemies[0].Talk();
		enemies[1].Talk();
	}

}
