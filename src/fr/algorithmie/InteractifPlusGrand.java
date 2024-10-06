package fr.algorithmie;

import java.util.Arrays;
import java.util.Scanner;

public class InteractifPlusGrand {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int userInput;
        System.out.println("Vous voulez savoir quel nombre est le plus grand entre 10 nombres ?");
        System.out.println("Commencer par saisir vos 10 nombres :");

        int[] numbersArray = new int[10];

        for (int i = 1; i <= 10; i++) {
            System.out.println("Saisir le nombre n°" + i + " :");
            userInput = scanner.nextInt();
            numbersArray[i - 1] = userInput;


        }


        int highNumber = 0;

        for (int i = 0; i < numbersArray.length; i++) {
            int currentNumber = numbersArray[i];

            if (currentNumber > highNumber) {
                highNumber = currentNumber;
            }
        }

        System.out.println("Le plus grand de ces 10 nombres est le : " + highNumber);
    }
}
