
public class Car 
{
	String brand;
	String model;
	int mileage;
	int seat[];
	boolean started;
	
	Car()
	{
		this.brand = new String();
		this.model = new String();
		seat = new int[4];
	}
	
	Car(String brand, String model)
	{
		this.brand = brand;
		this.model = model;
		seat = new int[4];
	}
	
	void start()
	{
		System.out.println("Ch-ch-ch vroom.");
		started = true;
	}
	
	void move()
	{
		if(started)
		{
			System.out.println("Vroom.");
			mileage += 1;
		}
		else
		{
			System.out.println("Silence.");
		}
	}
	
	void accelerateFast()
	{
		if(started)
		{
			System.out.println("VROOM!");
			mileage += 2;
		}
		else
		{
			System.out.println("Silence.");
		}
	}
	
	void checkMileage()
	{
		System.out.println(brand + " " + model + "'s mileage: " + mileage);
	}
	
	void stop()
	{
		System.out.println("Ch-ch-ch.. Silence.");
		started = false;
	}
	
	
	
	public static void main(String args[])
	{
		Car car1 = new Car("Ford", "Capri");
		
		car1.checkMileage();
		car1.start();
		car1.move();
		car1.move();
		car1.accelerateFast();
		car1.accelerateFast();
		car1.accelerateFast();
		car1.move();
		car1.stop();
		car1.checkMileage();
		
	}
	
}

