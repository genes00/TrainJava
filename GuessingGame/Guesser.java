package GuessingGame;

import java.util.Scanner;

public class Guesser {
	
	int gNum;
	
	int guessNum()
	{
		Scanner kb = new Scanner(System.in);
		gNum = kb.nextInt();
		return gNum;
		
	}
}
