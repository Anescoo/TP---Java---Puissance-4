package main;

public class InterfaceMain
{
    InterfaceMain() {
        System.out.println("Bon jeu à vous ! \n");

        Grid g1 = new Grid(8, 6);

        for(int tour = 1; tour <= 8*6  ; tour++){

            System.out.println("\nDebut de la partie : ");
            System.out.println("---------------------");
            System.out.println("Tour " + tour + " :" + " Joueur " + (tour%2 == 1 ? 'X' : 'O'));
            g1.playTurn(tour);
            g1.dispStartingGame();
            g1.afficheGrid();

        }

    }
}