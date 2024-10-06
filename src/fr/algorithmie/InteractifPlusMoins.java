package fr.algorithmie;

import java.util.Scanner;

public class InteractifPlusMoins {

    public static void main(String[] args) {

        System.out.println("Trouve le nombre aléatoire !");
        System.out.println("Génération d'un nombre aléatoire compris entre 1 et 100....");
        int randomNum = (int) (Math.random() * 101);

        Scanner scanner = new Scanner(System.in);
        int userInput;
        int count = 1;
        System.out.println(randomNum);


        do {

            System.out.println("Saisir un nombre :");
            userInput = scanner.nextInt();

            if (userInput > randomNum) {
                System.out.println("C'est moins !");
                count++;
            } else if (userInput < randomNum) {
                System.out.println("C'est plus !");
                count++;
            }

        } while (userInput != randomNum);

        System.out.println("Bravo, vous avez trouvé en " + count + " coups");


    }
}
