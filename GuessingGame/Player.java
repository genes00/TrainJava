package GuessingGame;

import java.util.Scanner;

public class Player {
	
	int pNum;
	
	int guessNum()
	{
		Scanner kb = new Scanner(System.in);
		pNum = kb.nextInt();
		return pNum;
		
	}

}
