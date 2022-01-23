class Plane
{
	void fly()
	{
		System.out.println("Plane is flying");
	}
}

class CargoPlane
{
	void fly()
	{
		System.out.println("Cargo plane is flying at low altitude");
	}
}

class PassengerPlane
{
	void fly()
	{
		System.out.println("Passenger plane is flying at medium altitude");
	}
}

class FighterPlane
{
	void fly()
	{
		System.out.println("Fighter plane is flying at high altitude");
	}
	
}
public class Overriding
{
	public static void main(String[] arr)
	{
		Plane p = new Plane();
		FighterPlane fp = new FighterPlane();
		p.fly();
		fp.fly();
	}
}
