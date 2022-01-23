class Chain
{
	String street;
	int number;
	int countryCode;
	
	Chain(String street, int number, int countryCode)
	{
		this.street = street;
		this.number = number;
		this.countryCode = countryCode;
	}
	Chain(String street, int number)
	{
		this(street, number, 0);
	}
	Chain(String street)
	{
		this(street, 0);
	}
	Chain()
	{
		this("X");
	}
	
	void print()
	{
		System.out.println(street + " " + number + " " + countryCode);
	}
}

public class ChainingDemo
{
	public static void main(String args[])
	{
		Chain a = new Chain("address",14,91);
		a.print();
		
		Chain c = new Chain();
		c.print();
	}

}
