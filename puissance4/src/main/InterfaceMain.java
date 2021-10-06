package main;

public class InterfaceMain
{
    public static void main( String[] args )
    {   

        System.out.println("Welcome to our puissance 4\n");

        Grid g1 = new Grid(8, 6);

<<<<<<< HEAD
        for(int tour = 0; tour <= 10; tour++){
            System.out.println("Debut de la partie : ");
            System.out.println("---------------------");
            g1.playTurn();
=======
        for(int tour = 1; tour <= 8*6  ; tour++){

            System.out.println("\nDebut de la partie : ");
            System.out.println("---------------------");
            System.out.println("Tour " + tour + " :" + " Joueur " + (tour%2 == 1 ? 'X' : 'O'));
            g1.playTurn(tour);
>>>>>>> origin/arnaud
            g1.dispStartingGame();
            g1.afficheGrid();
            g1.victoryPlayer();
        }
        // System.out.println("Tour du joueur" + (i%2==1 ? 'X' : 'O'));  <- tour joueur

    }
}