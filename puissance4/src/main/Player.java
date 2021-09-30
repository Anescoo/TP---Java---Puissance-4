package main;

import java.io.*;

public class Player {

	final String startingGame = "Quelle colonne choisissez-vous ?";
	final String winGame = "Vous avez gagné la partie !";
	final String loseGame = "Vous avez perdu la partie !";
	final String drawGame = "Egalité pour tous les joueurs";
	 

	String ChooseColumn() {
		System.out.println(startingGame);
		System.out.print(">> ");
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		try{
			String value = br.readLine();
			if (value > 65 );
			return value;
		}
		catch(IOException e){
			System.err.println("tkt tkt");
			return "veuillez réssayez";
		}
	}

	public static Turn() {
		for() 
	}

	public void dispStartingGame() {

		System.out.println("Vous avez choisis la colonne : " + ChooseColumn());
		System.out.println("---------------------");
		
		// System.out.println(winGame);
		// System.out.println(loseGame);
		// System.out.println(drawGame);
	}


	// public String win(){
    //     if(player1 > player2){
    //         System.out.println("Player1 has WON !!");
    //     }else if (player > player1){
    //         System.out.println("Player2 has WON !!");
    //     } else {
    //         System.out.println("Egalité");
    //     }
    // }
}

