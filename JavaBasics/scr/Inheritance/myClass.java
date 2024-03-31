package Inheritance;

public class myClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//mySubClass mySub = new mySubClass();
		mySubClass mySub = new mySubClass("test String");
		System.out.println(mySub.superStr);
		mySub.superClassMethod();
		mySub.mySubClassMethod();
		mySub.commonString();

	}

}
