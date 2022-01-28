package itemorder;

import java.util.Scanner;

class inputReader 
{
	static Scanner kb = new Scanner(System.in);
	
	static boolean getYesNoInput()	//Only scans first character of input for Y or y. Everything else is treated as N
	{
		return kb.next().toUpperCase().charAt(0) == 'Y';
	}
	
	static int getNumberInput()	//Returns number which entered, otherwise returns Integer.MIN_VALUE (-2,147,483,648)
	{
		if(kb.hasNextInt())
		{
			return kb.nextInt();
		}
		else
		{
			kb.next();
			return Integer.MIN_VALUE;
		}
		
	}
	
	static String getTextInput()
	{
		return kb.next();
	}
}
