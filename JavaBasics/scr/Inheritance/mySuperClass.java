package Inheritance;

public class mySuperClass {
	
	 String superStr ="Super class string";
	
	/*
	 * public mySuperClass() { System.out.println("Super class constructor"); }
	 */
	String supString="sup common string";

	public String commonStr ="Super class common string";;
	
	public mySuperClass(String str) {
		System.out.println(str);
	}
	
	public void superClassMethod()
	{
		System.out.println("Super class method");
	}

}
