package AlphabetPattern;

class AlphabetV
{
	static void print(int size, int currentLine)
	{
		int n = size;
		int r = currentLine;
		
		for(int c=1; c<=n; c++)
		{
			if( r - c == n/2 || r + c == 3*n/2 + 1 || (c == 1 || c == n) && r <= n/2) //V
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
