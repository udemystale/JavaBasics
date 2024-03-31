package test;

public class B_Class2 {

	int i = 9;
	 int k;
	static int g;

	public static void main(String[] args) {
		B_Class2 t = new B_Class2();
		System.out.println(t.i);

		// when ever object creation is there then invokes the contructor
		// t.t1();
		System.out.println(t.k);
		
		System.out.println("explicit constructor calling");
		B_Class2 t2 = new B_Class2(10);
		System.out.println(t2.k);
		
		
		System.out.println("static method calling");
		B_Class2.t4();
		System.out.println(g);
	}

	public static void t4() {
		g = 8;
	}

	// constructor
	public B_Class2() {
		k = 7;
	}
	//contrcutor overloading}
	
	public B_Class2(int k) {
	this.k=k;
	}
}
