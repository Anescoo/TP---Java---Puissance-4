package main;

public class InterfaceMain
{
    public static void main( String[] args )
    {   

        System.out.println("Welcome to our puissance 4\n");

        Grid g1 = new Grid(8, 6);

        for(int tour = 1; tour <= 8*6  ; tour++){
    
            System.out.println("\nDebut de la partie : ");
            System.out.println("---------------------");
            System.out.println("Tour " + tour + " :" + " Joueur " + (tour%2 == 1 ? 'O' : 'X'));
            g1.playTurn();
            g1.dispStartingGame();
            g1.afficheGrid();

        }

    }
}
