package fr.algorithmie;

import java.util.Arrays;

public class Rotation {

    public static void main(String[] args) {

        int[] array = {0, 1, 2, 3};
        int[] arrayCopy = Arrays.copyOf(array, array.length);


        for (int i = 0; i < array.length; i++) {

            if (i == 0) {
                array[i] = arrayCopy[array.length - 1];
            } else {
                array[i] = arrayCopy[i - 1];
            }


        }

//        array[0] = arrayCopy[3];
//        array[1] = arrayCopy[0];
//        array[2] = arrayCopy[1];
//        array[3] = arrayCopy[2];

        System.out.println(Arrays.toString(array));
    }
}
