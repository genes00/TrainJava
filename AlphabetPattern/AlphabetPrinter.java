package AlphabetPattern;

public class AlphabetPrinter 
{
	
//	public static void main(String args[])
//	{
//		print("abcdefghijklm",11);
//		System.out.println();
//		print("nopqrstuvwxyz",11);
//
//	}
	
	
	public static void print(String text, int size)
	{
		for(int r = 1; r <= size; r++)
		{
			for(char letter : text.toUpperCase().toCharArray())
			{
				if(letter >= 'A' && letter <= 'Z' || letter == ' ')
				{
					switch(letter)
					{
					case 'A': AlphabetA.print(size, r);
						break;
					case 'B': AlphabetB.print(size, r);
						break;
					case 'C': AlphabetC.print(size, r);
						break;
					case 'D': AlphabetD.print(size, r);
						break;
					case 'E': AlphabetE.print(size, r);
						break;
					case 'F': AlphabetF.print(size, r);
						break;
					case 'G': AlphabetG.print(size, r);
						break;
					case 'H': AlphabetH.print(size, r);
						break;
					case 'I': AlphabetI.print(size, r);
						break;
					case 'J': AlphabetJ.print(size, r);
						break;
					case 'K': AlphabetK.print(size, r);
						break;
					case 'L': AlphabetL.print(size, r);
						break;
					case 'M': AlphabetM.print(size, r);
						break;
					case 'N': AlphabetN.print(size, r);
						break;
					case 'O': AlphabetO.print(size, r);
						break;
					case 'P': AlphabetP.print(size, r);
						break;
					case 'Q': AlphabetQ.print(size, r);
						break;
					case 'R': AlphabetR.print(size, r);
						break;
					case 'S': AlphabetS.print(size, r);
						break;
					case 'T': AlphabetT.print(size, r);
						break;
					case 'U': AlphabetU.print(size, r);
						break;
					case 'V': AlphabetV.print(size, r);
						break;
					case 'W': AlphabetW.print(size, r);
						break;
					case 'X': AlphabetX.print(size, r);
						break;
					case 'Y': AlphabetY.print(size, r);
						break;
					case 'Z': AlphabetZ.print(size, r);
						break;
					case ' ': for(int i=0;i<size;i++) {System.out.print(' ');}
						break;
					}
				}
				System.out.print(' ');
			}
			System.out.println();
		}
		
	}
}
