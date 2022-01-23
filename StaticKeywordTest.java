class TestClass{
	
	{
		System.out.println("non static block");
	}
	
	static int NUM1 = 10;
	int num2;
	
	static
	{
		
		System.out.println("static block");
	}
	
	TestClass()
	{
		System.out.println("constructor");
	}
	
	{
		System.out.println(this+" non-static block");
	}
}


public class StaticKeywordTest {
	public static void main(String s[])
	{
		System.out.println("real main!");
		TestClass tc = new TestClass();
		
		
		
	}
}
