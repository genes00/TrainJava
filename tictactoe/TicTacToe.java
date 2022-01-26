package tictactoe;

import java.util.Random;
import java.util.Scanner;

public class TicTacToe 
{
	Core gameData;
	Scanner kb;
	Random r;
	
	TicTacToe()
	{
		kb = new Scanner(System.in);
		r = new Random();
	}
	
	public static void main(String args[])
	{
		TicTacToe ttt = new TicTacToe();
		
		ttt.startGame();
	}
	
	public void startGame()
	{
		gameData = new Core();
		Display.printInstructions();
		boolean gameOver = false;
		char winner = ' ';
		while(!gameOver)
		{
			getInput();
			winner = gameData.getWinner();
			gameOver = (gameData.isBoardFull() || winner != ' ');
		}
		Display.printBoard(gameData);
		switch(winner)
		{
		case 'X':
			System.out.println("You win!");
			break;
		case 'O':
			System.out.println("Conputer wins!");
			break;
		case ' ':
			System.out.println("It's a draw!");
			break;
		}
		System.out.println("Game over!");
	}
	
	void getInput()
	{
		boolean validInput = false;
		while(!validInput)
		{
			validInput = true;
			if(gameData.isOTurn())
			{
				try
				{
					int compInput = r.nextInt()%9 + 1;
					gameData.addInput(compInput);
					System.out.println("Computer placed O in position " +  compInput);
				}
				catch(IllegalArgumentException e)
				{
					validInput = false;
				}
			}
			else
			{
				Display.printBoard(gameData);
				System.out.println("Enter position to place X:");
				try
				{
					gameData.addInput(kb.nextInt());
				}
				catch(IllegalArgumentException e)
				{
					System.out.println(e.getMessage());
					validInput = false;
				}
			}
		}
	}
}
