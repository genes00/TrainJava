package AlphabetPattern;

class AlphabetK
{
	static void print(int size, int currentLine)
	{
		int n = size;
		int r = currentLine;
		
		for(int c=1; c<=n; c++)
		{
			if( c == 1 || r+c == n + 1 && r <= n/2 || r == c && r > n/2 || r == n/2 + n%2 && c <= n/2 + n%2) //K
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
