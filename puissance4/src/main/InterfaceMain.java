package main;

public class InterfaceMain
{
    InterfaceMain() {

        Grid g1 = new Grid(8, 6);

        System.out.println("Bon jeu a vous ! \n");
        g1.afficheGrid();

        for(int tour = 1; tour <= 8*6  ; tour++){

            System.out.println("\n");
            System.out.println("\nDebut de la partie : ");
            System.out.println("---------------------");
            System.out.println("Tour " + tour + " :" + " Joueur " + (tour%2 == 1 ? 'X' : 'O'));
            System.out.println("\n");
            g1.playTurn(tour);
            g1.dispStartingGame();
            g1.afficheGrid();
            g1.victoryPlayer(tour%2 == 1 ? 'X' : 'O');
        }

    }
}