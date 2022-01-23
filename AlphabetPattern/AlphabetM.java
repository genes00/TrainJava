package AlphabetPattern;

class AlphabetM
{
	static void print(int size, int currentLine)
	{
		int n = size;
		int r = currentLine;
		
		for(int c=1; c<=n; c++)
		{
			if( c == 1 || r == c && r <= n/2 + n%2 || r + c == n + 1 && r <= n/2 + n%2 || c == n) //M
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
