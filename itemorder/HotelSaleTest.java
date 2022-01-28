import itemorder.ItemOrderingSystem;

public class HotelSaleTest {

	public static void main(String[] args) 
	{
		ItemOrderingSystem ios = new ItemOrderingSystem("AVS HOTEL");
		ios.addItem("Coffee",4,"$");
		ios.addItem("Tea",4,"$");
		ios.addItem("Soft Drink",5,"$");
		ios.addItem("Water",3,"$");
		ios.start();

	}

}
