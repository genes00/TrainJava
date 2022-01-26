package tictactoe;

class Corev2 extends Core
{
	@Override
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
				if(isOTurn())
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
						"Position " +  (position+1) + " is already taken (" + input[position] + " . Please try again.");
				throw exception;
			}
		}
		computerTurn = !computerTurn;
	}
}
