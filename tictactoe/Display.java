package tictactoe;

class Display 
{
	static final char board[][] = {
			{'1','|','2','|','3'},
			{'-','+','-','+','-'},
			{'4','|','5','|','6'},
			{'-','+','-','+','-'},
			{'7','|','8','|','9'}
	};
	
	static void printInstructions()
	{
		
		System.out.println("You are X, playing against the computer who is O.");
		System.out.println("Enter 1-9 to place X in the position indicated.");
		for(int i=0; i<board.length;i++)
		{
			for(int j=0; j < board[i].length; j++)
			{
				System.out.print(board[i][j]);
			}
			System.out.println();
		}
		System.out.println("First to place 3 of a kind in a line (horizontal, vertical or diagonal) wins.");
		System.out.println();
	}
	
	static void printBoard(Core data)
	{
		for(int i=0; i<board.length;i++)
		{
			for(int j=0; j < board[i].length; j++)
			{
				if(board[i][j] >= '1' && board[i][j] <= '9')
				{
					int idx = Character.getNumericValue(board[i][j]) - 1;
					System.out.print(data.input[idx]);
				}
				else
				{
					System.out.print(board[i][j]);
				}
			}
			System.out.println();
		}
		System.out.println();
	}
}
