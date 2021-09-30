package main;

public class InterfaceMain
{
    public static void main( String[] args )
    {
        System.out.println("Welcome to our puissance 4\n");

        Player p1 = new Player();
        System.out.println("Debut de la partie : ");
        System.out.println("---------------------");
        p1.dispStartingGame();

        Grid g1 = new Grid(8, 6);
        g1.afficheGrid();


    }
}
