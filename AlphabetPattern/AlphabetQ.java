package AlphabetPattern;

class AlphabetQ
{
	static void print(int size, int currentLine)
	{
		int n = size;
		int r = currentLine;
		
		for(int c=1; c<=n; c++)
		{
			if( (r == 1 || r == n-1) && (c > 1 && c < n-1) || (c == 1 || c == n-1) && (r > 1 && r < n-1) || r == c && r >= 3*n/4) //Q
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
