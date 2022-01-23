
public class PatternPractice2
{
	static final int TRIANGLE_TOP_LEFT = 1;
	static final int TRIANGLE_BOTTOM_LEFT = 2;
	static final int TRIANGLE_TOP_RIGHT = 3;
	static final int TRIANGLE_BOTTOM_RIGHT = 4;
	
	public static void main(String[] args) 
	{
		int height = 5;
		int width = 5;
		char drawSymbol = '*';
		
		//first block
		for(int row=1; row<=height; row++)
		{
			drawTriangle(height, drawSymbol, TRIANGLE_BOTTOM_RIGHT, row);
			drawSquare(width, ' ', row);
			drawTriangle(height, drawSymbol, TRIANGLE_BOTTOM_LEFT, row);
			drawTriangle(height, drawSymbol, TRIANGLE_BOTTOM_RIGHT, row);
			drawSquare(width, ' ', row);
			drawTriangle(height, drawSymbol, TRIANGLE_BOTTOM_LEFT, row);
			newLine();
		}
		
		//second block
		for(int row=1; row<=height; row++)
		{
			drawSquare(width, drawSymbol, row);
			drawSquare(width, ' ', row);
			drawSquare(width, drawSymbol, row);
			drawSquare(width, drawSymbol, row);
			drawSquare(width, ' ', row);
			drawSquare(width, drawSymbol, row);
			newLine();
		}
		
		//third block
		for(int row=1; row<=height; row++)
		{
			drawSquare(width, drawSymbol, row);
			drawTriangle(height, drawSymbol, TRIANGLE_BOTTOM_LEFT, row);
			drawSquare(width, drawSymbol, row);
			drawSquare(width, drawSymbol, row);
			drawTriangle(height, drawSymbol, TRIANGLE_BOTTOM_RIGHT, row);
			drawSquare(width, drawSymbol, row);
			newLine();
		}
		
		//fourth block
		for(int row=1; row<=height; row++)
		{
			drawSquare(width, drawSymbol, row);
			drawSquare(width, drawSymbol, row);
			drawSquare(width, drawSymbol, row);
			drawSquare(width, drawSymbol, row);
			drawSquare(width, drawSymbol, row);
			drawSquare(width, drawSymbol, row);
			newLine();
		}
		
		//fifth block
		for(int row=1; row<=height; row++)
		{
			drawSquare(width, drawSymbol, row);
			drawTriangle(height, drawSymbol, TRIANGLE_TOP_LEFT, row);
			drawTriangle(height, drawSymbol, TRIANGLE_TOP_RIGHT, row);
			drawTriangle(height, drawSymbol, TRIANGLE_TOP_LEFT, row);
			drawTriangle(height, drawSymbol, TRIANGLE_TOP_RIGHT, row);
			drawSquare(width, drawSymbol, row);
			newLine();
		}
		
		//sixth block
		for(int row=1; row<=height; row++)
		{
			drawTriangle(height, drawSymbol, TRIANGLE_TOP_RIGHT, row);
			drawSquare(width, ' ', row);
			drawSquare(width, ' ', row);
			drawSquare(width, ' ', row);
			drawSquare(width, ' ', row);
			drawTriangle(height, drawSymbol, TRIANGLE_TOP_LEFT, row);
			newLine();
		}

	}
	public static void newLine()
	{
		System.out.println();
	}
	public static void repeatChar(int count, char character)
	{
		for(int i = 0; i < count; i++)
		{
			System.out.print(character);
		}
	}
	public static void drawTriangle(int height, char character, int triangleType, int rowNum) 
	{
		switch(triangleType)
		{
		case TRIANGLE_TOP_LEFT:
			//stars high to low, spaces low to high
			repeatChar(height-(rowNum-1), character);
			repeatChar(rowNum-1, ' ');
			break;
		case TRIANGLE_BOTTOM_LEFT:
			//stars low to high, spaces high to low
			repeatChar(rowNum, character);
			repeatChar(height-rowNum, ' ');
			
			break;
		case TRIANGLE_TOP_RIGHT:
			//spaces low to high, stars high to low
			repeatChar(rowNum-1, ' ');
			repeatChar(height-(rowNum-1), character);
			break;
		case TRIANGLE_BOTTOM_RIGHT:
			//spaces high to low, stars low to high
			repeatChar(height-rowNum, ' ');
			repeatChar(rowNum, character);
			break;
		}
	}
	public static void drawSquare(int width, char character, int rowNum) 
	{
		repeatChar(width, character);
	}
}
