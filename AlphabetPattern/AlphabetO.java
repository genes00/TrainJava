package AlphabetPattern;

class AlphabetO
{
	static void print(int size, int currentLine)
	{
		int n = size;
		int r = currentLine;
		
		for(int c=1; c<=n; c++)
		{
			if( (r == 1 || r == n) && (c > 1 && c < n) || (c == 1 || c == n) && (r > 1 && r < n) ) //O
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
