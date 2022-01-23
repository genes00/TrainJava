package AlphabetPattern;

class AlphabetW
{
	static void print(int size, int currentLine)
	{
		int n = size;
		int r = currentLine;
		
		for(int c=1; c<=n; c++)
		{
			if( c == 1 || c == n || r == c && r > n/2 || r + c == n + 1 && r > n/2) //W
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
