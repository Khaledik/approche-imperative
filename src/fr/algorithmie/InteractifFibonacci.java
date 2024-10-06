package fr.algorithmie;

import java.util.Scanner;

public class InteractifFibonacci {

    public static void main(String[] args) {

        System.out.println("La suite de Fibonacci !");
        System.out.println("Choisir un rang N :");

        int a = 0;
        int b = 1;
        int c = 0;

        Scanner scanner = new Scanner(System.in);

        int userInput;
        userInput = scanner.nextInt();


        if (userInput == 0) {
            System.out.println(a);
            return;
        } else if (userInput == 1) {
            System.out.println(b);
            return;
        }


        for (int i = 2; i <= userInput; i++) {
            c = a + b;
            a = b;
            b = c;
        }


        System.out.println(c);
    }
}
