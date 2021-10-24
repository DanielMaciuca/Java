package CallMethodByValueOrReference;

class Operational{  
	int data=50;  

	void change(int data){  
		data=data+100;//changes will be in the local variable only  
	}  

	public static void main(String args[]){  
		Operational op=new Operational();  

		System.out.println("before change "+op.data);  
		op.change(500);  
		System.out.println("after change "+op.data);  

	}  
}  

/* you can use this.data or 
 * update the change method to return the value */
