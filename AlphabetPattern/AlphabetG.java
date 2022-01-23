package AlphabetPattern;

class AlphabetG
{
	static void print(int size, int currentLine)
	{
		int n = size;
		int r = currentLine;
		
		for(int c=1; c<=n; c++)
		{
			if( c == 1 && r > 1 && r < n || r == 1 && c > 1 || r == n  && c > 1 && c < n || c == n && r > n/2 && r < n || r == n/2 + n%2 && c > n/2) //G
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
