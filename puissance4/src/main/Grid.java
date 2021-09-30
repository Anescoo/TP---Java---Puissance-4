package main;

import java.util.*;
import java.io.*;

public class Grid {

    final String startingGame = "Quelle colonne choisissez-vous ?";
	final String winGame = "Vous avez gagné la partie !";
	final String loseGame = "Vous avez perdu la partie !";
	final String drawGame = "Egalité pour tous les joueurs";

    boolean placement = false;

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

    public Grid(int v, int h){

        vertical = v;
        horizontal = h;
        grille = new char[horizontal][vertical]; 

    }

    public void playTurn() {
        this.choixJoueur = ChooseColumn();
        int rang = vertical -1;

        while(!placement){
            for(int i = 0; i < horizontal; i++){
                for (int j = 0; j < vertical; j++){

                    if (choixJoueur.equals("a")) {// placement du pion
                        grille[5][0] = 'X';
                    } else if (choixJoueur.equals("b")) {
                        grille[5][1] = 'X'; 
                    } else if (choixJoueur.equals("c")) {
                        grille[5][2] = 'X'; 
                    } else if (choixJoueur.equals("d")) {
                        grille[5][3] = 'X'; 
                    } else if (choixJoueur.equals("e")) {
                        grille[5][4] = 'X'; 
                    } else if (choixJoueur.equals("f")) {
                        grille[5][5] = 'X'; 
                    } else if (choixJoueur.equals("g")) {
                        grille[5][6] = 'X'; 
                    } else if (choixJoueur.equals("h")) {
                        grille[5][7] = 'X'; 
                    } 

                    if(grille[i][0] == ' '){// verifie si la case n'est pas prise
                        placement = true;
                    } else {
                        placement = true;
                    }

                }

                // while(grille[horizontal - 1][rang] == ' ' ){
                //     rang--;
                // }
                // grille[horizontal - 1][rang] = (i%2==1 ? 'X' : 'O');
            }

        }

    }

    public void afficheGrid() {

        System.out.println();
       
        for(int i = 0; i < horizontal; i++){
            System.out.print("#");
            for (int j = 0; j < vertical; j++){
        
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
