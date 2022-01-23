class ClassA{
	int a;
	
	ClassA()
	{
		System.out.println("A () const called");
		a = 10;
	}
	
	ClassA(int a)
	{
		System.out.println("A (int) const called");
		this.a = a;
	}
	ClassA(ClassA ca)
	{
		this(ca.a);
	}
}

class ClassB extends ClassA
{
	int a;
	int b;
	
	ClassB()
	{
		System.out.println("B() const called");
		a=11;
		b=20;
	}
	
	ClassB(int a, int b)
	{
		System.out.println("B(int,int) const called");
		this.a = a;
		this.b = b;
	}
	
}

public class InheiritanceConstTest {

	public static void main(String[] args) {
		ClassB ca = new ClassB(2,3);
		ClassB cb = new ClassB();
		
		System.out.println("ca.a is " + ca.a);
		System.out.println("upcasted ca.a is " + ((ClassA)ca).a);
		
	}

}
