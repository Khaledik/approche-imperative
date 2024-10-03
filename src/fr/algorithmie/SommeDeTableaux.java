package fr.algorithmie;

import java.util.Arrays;

public class SommeDeTableaux {
    public static void main(String[] args) {
        int[] array1 = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
        int[] array2 = {-1, 12, 17, 14, 5, -9, 0, 18, -6, 0, 4, -13, 5, 7, -2, 8, -1} ;

        int[] arraySum = new int[array1.length];
        int j = 0;


        for (int i = 0; i < array1.length ; i++) {
            arraySum[j] = array1[i] + array2[i];
            j++;
        }

        System.out.println(Arrays.toString(arraySum));
    }
}
