package main;

import java.util.*;

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

    public Grid(int v, int h){

        static int vertical;
        static int horizontal;
        static char [][] grille;
        vertical = v;
        horizontal = h;
        grille = new char[horizontal][vertical]; 

        for(ChooseColumn(value) = 'a'){
            grille[6][0] ='X';                //système : jeton se place dans la colonne choisis dans le terminal - a faire   
        }

        for(ChooseColumn(value) = 'b'){
            grille[6][1] ='X';
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

        System.out.println("Vous avez choisis la colonne : " + ChooseColumn());
        System.out.println("---------------------");

        // System.out.println(winGame);
        // System.out.println(loseGame);
        // System.out.println(drawGame);
    }


}