package AlphabetPattern;

class AlphabetC
{
	static void print(int size, int currentLine)
	{
		int n = size;
		int r = currentLine;
		
		for(int c=1; c<=n; c++)
		{
			if( c == 1 && r > 1 && r < n || (r == 1 || r == n) && c > 1 && c < n ) //C
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
