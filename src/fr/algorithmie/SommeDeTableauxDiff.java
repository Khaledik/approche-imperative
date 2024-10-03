package fr.algorithmie;

import java.util.Arrays;

public class SommeDeTableauxDiff {
    public static void main(String[] args) {
        int[] array1 = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
        int[] array2 = {-1, 12, 17, 14, 5, -9, 0, 18 };

        int[] arraySum = new int[array1.length];
        int j = 0;

        for (int i = 0; i < array1.length ; i++) {
            if (i < array2.length) {
                arraySum[j] = array1[i] + array2[i];
            } else {
                arraySum[j] = array1[i];
            }

            j++;
        }

        System.out.println(Arrays.toString(arraySum));
    }
}
