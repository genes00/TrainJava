package itemorder;

import java.io.PrintStream;

class DisplayPrinter 
{
	static private PrintStream stream = System.out;
	
	private int menuWidth;
	private String header;
	private String colName[];
	private int colWidth[];
	private boolean colBorder[];
	private char borderChar;
	
	DisplayPrinter(String headerName, String columnNames[], int columnWidths[], 
			boolean borderBetween[], char borderPattern) throws IllegalArgumentException
	{
		if(columnNames.length != columnWidths.length)
		{
			IllegalArgumentException e = new IllegalArgumentException("Array sizes must be the same. (" +
					columnNames.length + ", " + columnWidths.length + ", " + borderBetween.length + ")");
			throw e;
		}
		header = headerName;
		colName = columnNames;
		colWidth = columnWidths;
		colBorder = borderBetween;
		borderChar = borderPattern;
		menuWidth = 4;
		for(int i = 0; i < colName.length; i++)
		{
			columnWidths[i] = Integer.max(columnWidths[i],columnNames[i].length());
			menuWidth += columnWidths[i];
			if(colBorder[i])
			{
				menuWidth += 3;
			}
		}
	}
	
	static void setOutputStream(PrintStream newStream)
	{
		stream = newStream;
	}
	
	static void write(String text)
	{
		stream.println(text);
	}
	
	void printBillTable(String additionalHeader[], String items[][], String grandTotal) throws IllegalArgumentException
	{
		printMultiHeader(additionalHeader);
		printTableRow(colName);

		repeatChar(borderChar, menuWidth);
		stream.println();
		for(int i = 0; i < items.length; i++)
		{
			if(items[i].length != colName.length)
			{
				IllegalArgumentException e = new IllegalArgumentException("Array size is not compatible.");
				throw e;
			}
			printTableRow(items[i]);
		}
		repeatChar(borderChar, menuWidth);
		String grandTotalRow[] = new String[colName.length];
		for(int i = 0; i < grandTotalRow.length - 2; i++)
		{
			grandTotalRow[i] = "";
		}
		grandTotalRow[grandTotalRow.length-2] = "Grand Total";
		grandTotalRow[grandTotalRow.length-1] = grandTotal;
		stream.println();
		printTableRow(grandTotalRow);
		repeatChar(borderChar, menuWidth);
	}
	
	private void printMultiHeader(String additional[])
	{
		//print top line
		repeatChar(borderChar, menuWidth);
		stream.println();
		
			//print 1 char for side borders, then half the remaining space, followed by text, then half the remaining space again
			repeatChar(borderChar, 1);
			int spaceWidth = menuWidth - 2 - header.length();
			repeatChar(' ',spaceWidth / 2);
			stream.print(header);
			repeatChar(' ',spaceWidth / 2 + spaceWidth % 2);	//half width % 2 in case the width is an odd number to correct it
			repeatChar(borderChar, 1);
			stream.println();
			if(additional != null)
			{
				for(int i = 0; i < additional.length; i++)
				{
					spaceWidth = menuWidth - 3 - additional[i].length();
					stream.print(borderChar + " " + additional[i]);
					repeatChar(' ', spaceWidth);
					stream.print(borderChar);
					stream.println();
				}
			}
		
		
		//print bottom line
		repeatChar(borderChar, menuWidth);
		stream.println();
		
	}
	
	void printTable(String items[][]) throws IllegalArgumentException
	{
		
		printTableHeader();
		printTableRow(colName);

		repeatChar(borderChar, menuWidth);
		stream.println();
		for(int i = 0; i < items.length; i++)
		{
			if(items[i].length != colName.length)
			{
				IllegalArgumentException e = new IllegalArgumentException("Array size is not compatible.");
				throw e;
			}
			printTableRow(items[i]);
		}

		repeatChar(borderChar, menuWidth);
		stream.println();
	}
	
	private void printTableHeader()
	{
		//print top line
		repeatChar(borderChar, menuWidth);
		stream.println();
		
		//print 1 char for side borders, then half the remaining space, followed by text, then half the remaining space again
		repeatChar(borderChar, 1);
		int spaceWidth = menuWidth - 2 - header.length();
		repeatChar(' ',spaceWidth / 2);
		stream.print(header);
		repeatChar(' ',spaceWidth / 2 + spaceWidth % 2);	//half width % 2 in case the width is an odd number to correct it
		repeatChar(borderChar, 1);
		stream.println();
		
		//print bottom line
		repeatChar(borderChar, menuWidth);
		stream.println();
		
	}
	
	private void printTableRow(String names[]) throws IllegalArgumentException
	{
		if(names.length != colName.length)
		{
			IllegalArgumentException e = new IllegalArgumentException("Array size is not compatible.");
			throw e;
		}
		//printBlankRow();
		stream.print(borderChar + " ");
		
		for(int i = 0; i < colName.length; i++)
		{
			stream.print(names[i].substring(0, Integer.min(names[i].length(), colWidth[i])));
			repeatChar(' ', colWidth[i] - names[i].length());
			if(colBorder[i])
			{
				stream.print(" " + borderChar + " ");
			}
		}
		stream.print(" " + borderChar);
		stream.println();
	}
	
	static private void repeatChar(char chr, int count)
	{
		for(int i = 0; i < count; i++)
		{
			stream.print(chr);
		}
	}
	
	private void printBlankRow()
	{
		stream.print(borderChar + " ");
		for(int i = 0; i < colName.length; i++)
		{
			repeatChar(' ', colWidth[i]);
			if(colBorder[i])
			{
				stream.print(" " + borderChar + " ");
			}
		}
		stream.print(" " + borderChar);
		stream.println();
	}
	
	
}
