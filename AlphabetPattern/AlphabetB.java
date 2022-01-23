package AlphabetPattern;

class AlphabetB
{
	static void print(int size, int currentLine)
	{
		int n = size;
		int r = currentLine;
		
		for(int c=1; c<=n; c++)
		{
			if( c == 1 || r == 1 && c < 3*n/4 || c == 3*n/4 && r < n/2 + n%2 && r > 1 || (r == n/2 + n%2 || r == n) && c < n || c == n && r > n/2 + n%2 && r < n) //B
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
