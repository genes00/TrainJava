package AlphabetPattern;

class AlphabetD
{
	static void print(int size, int currentLine)
	{
		int n = size;
		int r = currentLine;
		
		for(int c=1; c<=n; c++)
		{
			if( c == 1 || (r == 1 || r == n) && c < n || c == n && r > 1 && r < n) //D
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
