package main;

public class InterfaceMain
{
    public static void main( String[] args )
    {
        System.out.println("Welcome to our puissance 4\n");

        Grid g1 = new Grid(8, 6);

        for(int tour = 0; tour <= 10; tour++){
            System.out.println("Debut de la partie : ");
            System.out.println("---------------------");
            g1.playTurn();
            g1.dispStartingGame();
            g1.afficheGrid();
            g1.victoryPlayer();
        }
        // System.out.println("Tour du joueur" + (i%2==1 ? 'X' : 'O'));  <- tour joueur

    }
}
