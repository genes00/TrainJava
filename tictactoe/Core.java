package tictactoe;

class Core 
{
	static final int winConditions[][] = {
			//numbers adjusted to start from 0, 
			//because array index starts at 0
			{0,1,2},
			{3,4,5},
			{6,7,8},
			{0,3,6},
			{1,4,7},
			{2,5,8},
			{0,4,8},
			{2,4,6}
	};
	
	char input[];					//to record moves by both players
	boolean computerTurn;	//for tracking turn switching
	
	Core()
	{
		input = new char[9];
		for(int i =0;i < input.length; i++)
		{
			input[i] = ' ';
		}
	}
	
	boolean isOTurn()
	{
		return computerTurn;
	}
	
	void addInput(int position)		//checks if number is in range or not already taken, otherwise throw IllegalArgumentException
	{
		if(position < 1 || position > 9)	
		{
			IllegalArgumentException exception = new IllegalArgumentException("Number is not between 1 to 9. Please try again.");
			throw exception;
		}
		else
		{
			position -= 1;
			if(input[position] != 'X' && input[position] != 'O')	//checks if position is already not taken
			{
				if(computerTurn)
				{
					input[position] = 'O';
				}
				else
				{
					input[position] = 'X';
				}
			}
			else
			{
				IllegalArgumentException exception = new IllegalArgumentException(
						"Position " +  (position+1) + " is already taken (" + input[position] + "). Please try again.");
				throw exception;
			}
		}
		computerTurn = !computerTurn;
	}
	
	
	char getWinner() //method returns 'X' or 'O' if a respective winner is found, otherwise it returns whitespace ' '
	{
		for(int i=0; i<winConditions.length;i++)
		{
			if(
					input[winConditions[i][0]] == input[winConditions[i][1]] &&
					input[winConditions[i][0]] == input[winConditions[i][2]] && 
					input[winConditions[i][0]] != ' ')
			{
				return input[winConditions[i][0]];
			}
		}
		return ' ';
	}
	boolean isBoardFull()
	{
		for(int i=0; i < input.length; i++)
		{
			if(input[i] == ' ')
			{
				return false;
			}
		}
		return true;
	}
}
