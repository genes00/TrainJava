
class Test{
	int a;
	
}

public class StringRefTest {
	
	public static void main(String args[])
	{
		Test t1 = new Test();
		Test t2 = t1;
		t1.a = 10;
		System.out.println("t1 is " + t1.a);
		System.out.println("t2 is " + t2.a);
		t2.a = 20;
		System.out.println("Changing t2 to 20.");
		System.out.println("t1 is " + t1.a);
		System.out.println("t2 is " + t2.a);
		String s1 = new String("Hello world");
		String s2 = s1;
		System.out.println("s1 is " + s1);
		System.out.println("s2 is " + s2);
		s2 = s2.replace("Hello", "Hi");
		System.out.println("Replacing Hello in s2 to Hi");
		System.out.println("s1 is " + s1);
		System.out.println("s2 is " + s2);
		
		
	}


}
