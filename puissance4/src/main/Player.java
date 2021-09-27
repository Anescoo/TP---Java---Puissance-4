package main;

public class Player {

	final String startingGame = "Quelle colonne choisissez-vous ?";
	final String winGame = "Vous avez gagné la partie !";
	final String loseGame = "Vous avez perdu la partie !";
	final String drawGame = "Egalité pour tous les joueurs";

	public void display() {

		System.out.println(startingGame);
		System.out.println(winGame);
		System.out.println(loseGame);
		System.out.println(drawGame);
	}
}
