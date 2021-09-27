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

        for(int x = 0; x < 6; x++){

            System.out.println('#'+ "        " + "#");
        }

        for (int y = 0; y < 10; y++){
        System.out.print("#");
        }
        System.out.println();

        for (char v = 'a'; v <= 'h'; v++){
            System.out.print(v);
        }

    
    }
}
