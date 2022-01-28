package itemorder;

import java.io.PrintStream;
import java.util.ArrayList;

public class ItemOrderingSystem
{
	public ArrayList<SaleItem> items;
	private ShoppingCart cart;
	DisplayPrinter itemMenuWriter;
	DisplayPrinter billWriter;
	String menuName;
	String customerName, customerEmail;
	
	public ItemOrderingSystem()
	{
		this("ITEM");
	}
	
	public ItemOrderingSystem(String menuName)
	{
		items = new ArrayList<SaleItem>();
		cart = new ShoppingCart();
		this.menuName = menuName;
		setItemMenuTable();
		setBillTable();
		
	}
	
	public void start()
	{
		getCustomerDetail();
		getOrder();
		printBill();
	}
	
	public void setOutputStream(PrintStream newOutputStream)
	{
		DisplayPrinter.setOutputStream(newOutputStream);
	}
	
	public void addItem(String itemName, int cost, String currency)
	{
		items.add(new SaleItem(itemName, cost, currency));
	}
	
	private void printBill()
	{
		String headers[] = {"Billed To: " + customerName, "Email: " + customerEmail};
		billWriter.printBillTable(headers, convertListToStringArray(cart), cart.getGrandTotalString());
	}
	
	private void setBillTable()
	{
		String colNames[] = {"S/No.", "Item Name", "Price", "Quantity", "Subtotal"};
		int widths[] = {8, 15, 8, 13, 6};
		boolean borderInBetween[] = {false, false, false, true, false};
		billWriter = new DisplayPrinter(menuName + " BILL", colNames, widths, borderInBetween, '*');
	}
	
	private void setItemMenuTable()
	{
		String colNames[] = {"S/No.","Item Name", "Price"};
		int widths[] = {5, 15, 6};
		boolean borderInBetween[] = {true, true, false};
		itemMenuWriter = new DisplayPrinter(menuName + " MENU", colNames, widths, borderInBetween, '+');
	}
	
	private void getOrder()
	{
		boolean valid = false;
		int inputItemNumber, inputItemQuantity;
		do
		{
			do
			{
				itemMenuWriter.printTable(convertListToStringArray(items));
				DisplayPrinter.write("Please select your item number:");
				inputItemNumber = inputReader.getNumberInput();
				valid = inputItemNumber >= 1 && inputItemNumber <= items.size();
				if(!valid)
				{
					DisplayPrinter.write("Invalid choice. Please try again.");
				}
				else
				{
					DisplayPrinter.write("Please enter the quantity for " + items.get(inputItemNumber-1).getName() + ":");
					inputItemQuantity = inputReader.getNumberInput();
					valid = inputItemQuantity >= 1;
					if(!valid)
					{
						DisplayPrinter.write("Invalid quantity. Please try again.");
					}
					else
					{
						cart.add(items.get(inputItemNumber - 1), inputItemQuantity);
					}
				}
			}while(!valid);
			DisplayPrinter.write("Do you wish to select more items? (y/n)");
		}while(inputReader.getYesNoInput());
	}
	
	private void getCustomerDetail()
	{
		System.out.println("Enter your name:");
		customerName = inputReader.getTextInput();
		System.out.println("Enter your email address:");
		customerEmail = inputReader.getTextInput();
	}
	
	
	
	private String[][] convertListToStringArray(ArrayList<SaleItem> item)
	{
		String[][] returnArray = new String[item.size()][3];
		for(int i = 0; i < item.size(); i++)
		{
			returnArray[i][0] = Integer.toString(i + 1);
			returnArray[i][1] = item.get(i).getName();
			returnArray[i][2] = item.get(i).getCostString();
		}
		return returnArray;
	}
	
	private String[][] convertListToStringArray(ShoppingCart cart)
	{
		String[][] returnArray = new String[cart.selectedItems.size()][5];
		String currency = cart.selectedItems.get(0).currency;
		for(int i = 0; i < cart.selectedItems.size(); i++)
		{
			returnArray[i][0] = Integer.toString(i + 1);
			returnArray[i][1] = cart.selectedItems.get(i).getName();
			returnArray[i][2] = cart.selectedItems.get(i).getCostString();
			returnArray[i][3] = cart.itemQuantity.get(i).toString();
			returnArray[i][4] = currency + Integer.toString(cart.selectedItems.get(i).getCostValue() * cart.itemQuantity.get(i));
		}
		return returnArray;
	}
}
