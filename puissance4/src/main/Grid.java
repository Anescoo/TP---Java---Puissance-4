package main;

import java.util.*;
import java.io.*;

public class Grid {

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
            if(value.charAt(0) >= 'a' && value.charAt(0) <= 'h'){
                System.out.println(value);
            } else {
                throw new IOException("\nErreur ! Choississez une colonne valable\n");
            }
            return value;
        }
        catch(IOException e){
            System.err.println(e.getMessage());
            return ChooseColumn();
        }
	}

    static int vertical;
    static int horizontal;
    static char [][] grille;
    String choixJoueur;

    public Grid(int h, int v){

        vertical = v;
        horizontal = h;
        grille = new char[vertical][horizontal]; 

    }

    public void playTurn() {
        this.choixJoueur = ChooseColumn();
        int choixInt = choixJoueur.charAt(0) - 'a';
        boolean validColonne = false;

        
        for(int i = grille.length-1; i >= 0; i--){
            if(grille[i][choixInt] == '\0'){// verifie si la case n'est pas prise
                grille[i][choixInt] = 'X';
                validColonne = true;
                break;
            }
        } 
        if(!validColonne){
            System.out.println("Colonne est deja prise");
            playTurn();
        }  
    }

    public void afficheGrid() {

        System.out.println();
       
        for(int i = 0; i < vertical; i++){
            System.out.print("#");
            for (int j = 0; j < horizontal; j++){
        
                System.out.print(grille[i][j]);

            }
            System.out.println("#");

        }
        System.out.print("##########");
        System.out.println();
        System.out.print(" abcdefgh ");
    }

    public void dispStartingGame() {

		System.out.println("Vous avez choisis la colonne : " + choixJoueur);
		System.out.println("---------------------");
		
		// System.out.println(winGame);
		// System.out.println(loseGame);
		// System.out.println(drawGame);
	}


}
