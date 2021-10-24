package Encapsulation;

public class Enemy {
	
	 private int health;
	
	public void Talk() {
		
		System.out.println("I am an enemy. You better run");
	}

	public void getHealth() {
		
		System.out.println(health);
		
	}
	
	public void setHealt(int x) {
		
		health = x;
		
	}
	
	
}
