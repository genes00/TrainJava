package GuessingGame;

public class Umpire {
	
	int guesserNum;
	int p1Num;
	int p2Num;
	int p3Num;
	
	void getGuesserNum(Guesser g) {
		System.out.println("Guesser, guess a number");
		guesserNum = g.guessNum();
	}
	
	void getPlayerNum(Player p1, Player p2, Player p3) {
		System.out.println("Player 1, guess a number");
		p1Num = p1.guessNum();
		System.out.println("Player 2, guess a number");
		p2Num = p2.guessNum();
		System.out.println("Player 3, guess a number");
		p3Num = p3.guessNum();
	}
	
	void compare()
	{
		boolean p1win = p1Num == guesserNum;
		boolean p2win = p2Num == guesserNum;
		boolean p3win = p3Num == guesserNum;
		
		if(p1win && p2win && p3win) {
			System.out.print("All players");
		}
		else if(p1win && p2win && !p3win)
		{
			System.out.print("Players 1 & 2");
		}
		else if(p1win && p3win && !p2win)
		{
			System.out.print("Players 1 & 3");
		}
		else if(p2win && p3win && !p1win)
		{
			System.out.print("Players 2 & 3");
		}
		else if(p1win && !p2win && !p3win)
		{
			System.out.print("Player 1");
		}
		else if(!p1win && p2win && !p3win)
		{
			System.out.print("Player 2");
		}
		else if(!p1win && !p2win && p3win)
		{
			System.out.print("Player 3");
		}
		else
		{
			System.out.print("No players");
		}
		System.out.println(" win. Game over.");
	}

}
