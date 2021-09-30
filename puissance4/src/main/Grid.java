package main;

import java.util.*;

public class Grid {

    static int vertical;
    static int horizontal;
    static char [][] grille;

    public Grid(int v, int h){

        vertical = v;
        horizontal = h;
        grille = new char[horizontal][vertical]; 

        for(int i = 0; i < horizontal; i++){
            for (int j = 0; j < vertical; j++){

                grille[5][0] = 'X'; 

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
}
