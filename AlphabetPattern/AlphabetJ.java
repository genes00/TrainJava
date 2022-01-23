package AlphabetPattern;

class AlphabetJ
{
	static void print(int size, int currentLine)
	{
		int n = size;
		int r = currentLine;
		
		for(int c=1; c<=n; c++)
		{
			if( r == 1 || c == n && r < n || r == n && c > 1 && c < n || c == 1 && r > 3*n/4 && r < n) //J
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
