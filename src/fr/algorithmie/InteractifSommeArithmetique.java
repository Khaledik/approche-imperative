package fr.algorithmie;

import java.util.Scanner;

public class InteractifSommeArithmetique {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int userInput;
        System.out.println("Saisir un nombre :");
        userInput = scanner.nextInt();

        int userOutput = 0;

        for (int i = 1; i <= userInput; i++) {
            userOutput += i;
        }

        System.out.println(userOutput);

    }
}
