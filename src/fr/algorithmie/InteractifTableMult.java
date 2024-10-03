package fr.algorithmie;

import java.util.Scanner;

public class InteractifTableMult {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int userInput;

        do {
            System.out.println("Saisir un nombre compris entre 1 et 10 :");
            userInput = scanner.nextInt();
        } while (userInput < 1 || userInput > 10);

        for (int i = 0; i <= 10 ; i++) {
            System.out.println(userInput + "*" + i + "= " + userInput * i);
        }

    }
}
