package itemorder;

class SaleItem 
{
	String name;
	int cost;
	String currency;
	
	SaleItem(String itemName, int cost, String currency)
	{
		name = itemName;
		this.cost = cost;
		this.currency = currency;
	}
	
	String getCostString()
	{
		return currency + Integer.toString(cost);
	}
	
	int getCostValue()
	{
		return cost;
	}
	
	String getName()
	{
		return name;
	}

}
