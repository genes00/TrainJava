package AlphabetPattern;

class AlphabetY
{
	static void print(int size, int currentLine)
	{
		int n = size;
		int r = currentLine;
		
		for(int c=1; c<=n; c++)
		{
			if( r == c && r <= n/2 + n%2 || r + c == n + 1 && r <= n/2 + n%2 || c == n/2 + n%2 && r > n/2) //Y
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
