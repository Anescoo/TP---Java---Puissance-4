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
        System.out.println(" 2. Jouer en réseau ");
        System.out.println("----------------------------------------------------");
        System.out.println("Votre choix :    ");
        String choix = clavier.nextLine();

        switch (choix) {

        case "1":
        
            break;
        case "2":
            System.out.println("a");
            break;
            default: 
            System.out.println("! Erreur ! Veuillez sélectionner un choix valable");
        }
    }
}