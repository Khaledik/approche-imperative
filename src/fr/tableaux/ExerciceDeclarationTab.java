package fr.tableaux;

public class ExerciceDeclarationTab {
    public static void main(String[] args) {
        int[] numbers = {8, -7, 12, 1, -2, 14,17, 9};


        System.out.println(numbers[0]);

        System.out.println(numbers.length);

        System.out.println(numbers[numbers.length - 1]);

//      Cela échoue car le tableau d'entier numbers ne contient que 8 élements et dans tableau
//      on commence à compter par 0 et donc ce tableau ne va contenir que 7 index au dela la console nous renverra une erreur car il n'existe pas.
        System.out.println(numbers[10]);

    }
}
