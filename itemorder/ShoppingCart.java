package itemorder;

import java.util.ArrayList;

public class ShoppingCart 
{
	ArrayList<SaleItem> selectedItems;
	ArrayList<Integer> itemQuantity;

	ShoppingCart()
	{
		selectedItems = new ArrayList<SaleItem>();
		itemQuantity = new ArrayList<Integer>();
	}
	
	void add(SaleItem saleItem, int inputItemQuantity)
	{
		int itemIndex = selectedItems.indexOf(saleItem);
		if(itemIndex != -1)
		{
			int newQuantity = itemQuantity.get(itemIndex) + inputItemQuantity;
			itemQuantity.set(itemIndex, newQuantity);
		}
		else
		{
			selectedItems.add(saleItem);
			itemQuantity.add(inputItemQuantity);
		}
		
	}
	String getGrandTotalString()
	{
		int grandTotal = 0;
		if(selectedItems.size() > 0)
		{
			String currency = selectedItems.get(0).currency;
			for(int i = 0; i < selectedItems.size(); i++)
			{
				grandTotal += selectedItems.get(i).getCostValue() * itemQuantity.get(i);
			}
			return currency + Integer.toString(grandTotal);
		}
		else
		{
			return "";
		}
	}
}
