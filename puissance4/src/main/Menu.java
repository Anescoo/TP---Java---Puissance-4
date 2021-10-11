package main;

import java.util.*;
import java.io.*;


public static void menuModJeu()
    {
        Scanner sc=new Scanner(System.in);
        int rep3 = 0;
         
        do
        {
            System.out.println("-------------------------Mode de jeu--------------------------");
            System.out.println("                   1. Jouer en local                                 ");
            System.out.println("               2. Jouer en réseau                             ");
            System.out.println("Taper votre choix :                                       ");
            rep3=Integer.parseInt(sc.nextLine());// <--- ligne modifiée
            switch(rep3) 
            {
            case 1: String ND;
                    System.out.println("Taper le numéro de votre choix !:");
                    ND=sc.nextLine();
                    break;
            case 2:
                    break;
        
            default:System.out.println("Veuillez respecter le menu !");
            }
        }while(rep3!=6);
         
    }