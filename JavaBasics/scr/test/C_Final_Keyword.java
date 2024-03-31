package test;

public class C_Final_Keyword {

	
	// using consrtutor u can set up only non static final vairbale u can not set up 
	// the static final variable
	 final int i;
	
	public C_Final_Keyword()
	{
		i=9;
	}	
	
	
	public C_Final_Keyword(int k)
	{
		this.i = k;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C_Final_Keyword test = new C_Final_Keyword();
		System.out.println(test.i);
		
		System.out.println("Setting up final variable");
		System.out.println(new C_Final_Keyword(10).i);
		
		//calling up th other class varaible
		
		System.out.println(MyConstant.LONG_WAIT);
		
		System.out.println(EnumConstant.SUNDAY);
		
		
	}

}
