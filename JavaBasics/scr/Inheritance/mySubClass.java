package Inheritance;

public class mySubClass extends mySuperClass {

	/*
	 * public mySubClass() { System.out.println("sub class constructor"); }
	 */
	String commonStr ="Sub class common string";
	public mySubClass(String str) {
		super(str);
		System.out.println("sub class constructor");
	}

	void mySubClassMethod() {
		
		System.out.println("my sub class method");
	}
	
	void commonString()
	{
		System.out.println(commonStr);
		System.out.println(super.commonStr);
	}

}
