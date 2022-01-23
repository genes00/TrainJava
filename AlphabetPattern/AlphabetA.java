package AlphabetPattern;

class AlphabetA
{
	static void print(int size, int currentLine)
	{
		int n = size;
		int r = currentLine;
		
		for(int c=1; c<=n; c++)
		{
			if( (c == 1 || c == n) && r > n/2 || r+c == (n/2) + 1 + n%2 || c-r == n/2 || r == n/2 + n%2) //A
			{
				System.out.print('*');
			}
			else
			{
				System.out.print(' ');
			}
		}
	}
}
