package fr.algorithmie;

public class RechercheMin {
    public static void main(String[] args) {

        int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
        int minNumber = array[0];

        for (int i = 0; i < array.length; i++) {

            if (minNumber > array[i]) {
                minNumber = array[i];
            }

        }
        System.out.println("le plus petit élément du tableau est " + minNumber);
    }
}
