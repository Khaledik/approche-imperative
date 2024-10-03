package fr.algorithmie;

public class FirstLast6 {
    public static void main(String[] args) {

        int[] arrayInt = {4, 4, 8, 7, 9, 5, 2, 1, 20, 6};
        boolean bool = false;


        if (arrayInt.length >= 0 && (arrayInt[0] == 6 || arrayInt[arrayInt.length - 1] == 6)) {
            bool = true;
        } else {
            bool = false;
        }

        System.out.println(bool);

    }
}
