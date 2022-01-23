package AlphabetPattern;

class AlphabetR
{
	static void print(int size, int currentLine)
	{
		int n = size;
		int r = currentLine;
		
		for(int c=1; c<=n; c++)
		{
			if( c == 1 || r == 1 && c < n || c == n && r < n/2 + n%2 && r > 1 || (r == n/2 + n%2 && c < n) || r == c && r > n/2 + n%2) //R
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
