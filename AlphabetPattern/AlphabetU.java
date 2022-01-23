package AlphabetPattern;

class AlphabetU
{
	static void print(int size, int currentLine)
	{
		int n = size;
		int r = currentLine;
		
		for(int c=1; c<=n; c++)
		{
			if( r == n && c > 1 && c < n || (c == 1 || c == n) && r < n ) //U
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
