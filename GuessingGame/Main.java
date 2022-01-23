package GuessingGame;

public class Main {

	public static void main(String[] args) 
	{
		Guesser g = new Guesser();
		Umpire u = new Umpire();
		Player p1 = new Player();
		Player p2 = new Player();
		Player p3 = new Player();
		
		u.getGuesserNum(g);
		u.getPlayerNum(p1, p2, p3);
		u.compare();
	}

}
