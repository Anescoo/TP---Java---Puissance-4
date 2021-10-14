package main;

import java.util.*;
import java.io.*;


public class Menu {
    
    public static void main (String[] args) {

        Scanner clavier = new Scanner(System.in);

        System.out.println("----------------------------------------------------");
        System.out.println("                     PUISSANCE 4");
        System.out.println("----------------------------------------------------");
        System.out.println("         Veuillez choisir votre mode de jeu :");
        System.out.println("----------------------------------------------------");
        System.out.println(" 1. Jouer en local ");
        System.out.println(" 2. Jouer en reseau ");
        System.out.println("----------------------------------------------------");
        System.out.println("Votre choix :    ");
        System.out.println();
        String choix = clavier.nextLine();

        switch (choix) {

        case "1":
            System.out.println();
            System.out.println("Debut de la partie en local...");
            System.out.println("-----------");
            InterfaceMain newApp = new InterfaceMain();
            System.out.println("----------------------------------------------------");
            System.out.println();
            
            break;
        case "2":
            System.out.println();
            System.out.println("Debut de la partie en reseau... (pas encore fonctionnel)");
            System.out.println("----------------------------------------------------");
            System.out.println();
            break;
            default: 
            System.out.println("! Erreur ! Veuillez selectionner un choix valable");
        }
    }
}