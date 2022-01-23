
public class PatternPractice
{
	public static void main(String[] args)
	{
		//PART 1
		for(int j=1; j<=5; j++)
		{
			//print spacing
			for(int i=5; i>=j; i--)
			{
				System.out.print(" ");
			}
			
			//print stars
			for(int i=1; i<=j; i++)
			{
				System.out.print("*");
			}
			
			//print spacing
			for(int i=1; i<=5; i++)
			{
				System.out.print(" ");
			}
			
			//print stars
			for(int i=1; i<=j; i++)
			{
				System.out.print("*");
			}
			
			//new line
			System.out.println();
		}
		
		//PART 2
		for(int j=1; j<=5; j++)
		{
			for(int i=1;i<=6;i++)
			{
				System.out.print(" ");
			}
			for(int i=1;i<=5;i++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		//PART 3
		for(int j=1; j<=5; j++)
		{
			//print spacing
			for(int i=1; i<=j; i++)
			{
				System.out.print(" ");
			}
			
			//print stars
			for(int i=5; i>=j; i--)
			{
				System.out.print("*");
			}
			
			//print spacing
			for(int i=1; i<=5; i++)
			{
				System.out.print(" ");
			}
			
			//print stars
			for(int i=5; i>=j; i--)
			{
				System.out.print("*");
			}
			
			//new line
			System.out.println();
		}
	}
}
