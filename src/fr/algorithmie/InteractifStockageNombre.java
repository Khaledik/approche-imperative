package fr.algorithmie;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class InteractifStockageNombre {

    public static void main(String[] args) {
        Boolean launch = true;
        ArrayList<Integer> array = new ArrayList<>();
        System.out.println("Bonjour !");


        do {
            System.out.println("Choisit une option :");
            System.out.println("1) Ajouter un nombre");
            System.out.println("2) Afficher les nombres existants");
            System.out.println("3) Quitter");


            String choix = null;

            Scanner scanner = new Scanner(System.in);

            choix = scanner.nextLine();

            switch (choix) {
                case "1":
                    System.out.println("Saisir un nombre :");
                    choix = scanner.nextLine();
                    array.add(Integer.valueOf(choix));
                    break;
                case "2":
                    System.out.println(array);
                    break;
                case "3":
                    System.out.println("Aurevoir !");
                    launch = false;
                    break;
                default:
                    System.out.println("Choix inconnu :/");
            }

        } while (launch == true);


    }

    ;

}



