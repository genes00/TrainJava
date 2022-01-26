package tictactoe;

class Displayv2 extends Display
{
	static void printInstructions()
	{
		System.out.println("Enter 1-9 to place X or O in the position indicated. X starts first.");
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
}
