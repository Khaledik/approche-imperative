package fr.algorithmie;

import java.util.Scanner;

public class InteractifChiffresSuivants {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int userInput;
        System.out.println("Saisir un nombre :");
        userInput = scanner.nextInt();


        for (int i = 0; i < 10; i++) {
            System.out.println(userInput + i);
        }
    }
}
