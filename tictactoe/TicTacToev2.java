package tictactoe;

//I know I can modify the original TicTacToe class for 2 players.
//Wanted to "pretend" the original class is closed for modification instead.

public class TicTacToev2 extends TicTacToe {

	public static void main(String[] args) 
	{
		TicTacToev2 ttt = new TicTacToev2();
		
		ttt.startGame();

	}
	
	@Override
	public void startGame()
	{
		System.out.println("Welcome to Tic Tac Toe!");
		
		int choice;
		boolean valid;
		do
		{
			System.out.println("Enter 1 for Player vs CPU, or 2 for Player vs Player:");
			choice = kb.nextInt();
			valid = (choice == 1 || choice == 2);
			if(!valid)
			{
				System.out.print ("Invalid choice. ");
			}
		}while(!valid);
		
		if(choice == 1)
		{
			TicTacToe ttt = new TicTacToe();
			ttt.startGame();
		}
		else
		{
			gameData = new Corev2();
			Displayv2.printInstructions();
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
				System.out.println("X Player wins!");
				break;
			case 'O':
				System.out.println("O Player wins!");
				break;
			case ' ':
				System.out.println("It's a draw!");
				break;
			}
			System.out.println("Game over!");
		}
	}
		
	@Override
	void getInput()
	{
		boolean validInput = false;
		while(!validInput)
		{
			validInput = true;
			Display.printBoard(gameData);
			System.out.println("Enter position to place " + (gameData.isOTurn() ? 'O':'X') + ":");
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
