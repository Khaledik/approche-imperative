package fr.algorithmie;

public class FirstLast {
    public static void main(String[] args) {
        int[] arrayInt = {4, 4, 8, 7, 9, 5, 2, 1, 20, 4};
        boolean bool = false;


        if (arrayInt.length >= 1 && (arrayInt[0] == arrayInt[arrayInt.length - 1])) {
            bool = true;
        } else {
            bool = false;
        }

        System.out.println(bool);
    }
}
