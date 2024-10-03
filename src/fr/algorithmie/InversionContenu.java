package fr.algorithmie;

import java.util.Arrays;

public class InversionContenu {
    public static void main(String[] args) {
        int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;


        int[] arrayCopy = new int[array.length];
        int j = 0;



        for (int i = array.length - 1 ; i >= 0 ; i--) {
            arrayCopy[j] = array[i];
            j++;
        }

        System.out.println("array :" +  Arrays.toString(array) + "\n arrayCopy :" + Arrays.toString(arrayCopy));
    }
}
