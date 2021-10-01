package main;

public class InterfaceMain
{
    public static void main( String[] args )
    {
        System.out.println("Welcome to our puissance 4\n");

        for(int tour = 0; tour <= 4; tour++){}

        
        Grid g1 = new Grid(8, 6);
        System.out.println("Debut de la partie : ");
        System.out.println("---------------------");
        g1.playTurn();
        g1.dispStartingGame();
        g1.afficheGrid();

    

        // System.out.println("Tour du joueur" + (i%2==1 ? 'X' : 'O'));  <- tour joueur

    }
}
