package AlphabetPattern;

class AlphabetH
{
	static void print(int size, int currentLine)
	{
		int n = size;
		int r = currentLine;
		
		for(int c=1; c<=n; c++)
		{
			if( c == 1 || c == n  || r == n/2 + n%2 ) //H
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
