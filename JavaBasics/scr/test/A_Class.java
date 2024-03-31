package test;

public class A_Class {

	int i = 9;
	int k;

	public static void main(String[] args) {
		A_Class t = new A_Class();
		System.out.println(t.i);

		// when ever object creation is there then invokes the contructor
		// t.t1();
		System.out.println(t.k);
		
		System.out.println("explicit constructor calling");
		A_Class t2 = new A_Class(10);
		System.out.println(t2.k);
	}

	public void t1() {
		k = 8;
	}

	// constructor
	public A_Class() {
		k = 7;
	}
	//contrcutor overloading}
	
	public A_Class(int k) {
	this.k=k;
	}
}
