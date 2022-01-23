package AlphabetPattern;

class AlphabetS
{
	static void print(int size, int currentLine)
	{
		int n = size;
		int r = currentLine;
		
		for(int c=1; c<=n; c++)
		{
			if( r == 1 && c > 1 || r == n && c < n || c == 1 && r > 1 && r < n/2 + n%2 || c == n && r < n && r > n/2 + n%2 || r == n/2 + n%2 && c > 1 && c < n ) //S
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
