package fr.tableaux;

import java.util.Arrays;

public class ExerciceTableauChaines {
    public static  void main(String[] args) {
        String[] villes = {"Alès", "Nîmes", "Montpellier", "Paris", "Marseille"};

        for (int i = 0; i < villes.length; i++) {
            System.out.println(villes[i]);
        }

        System.out.println(villes.length);

        villes[3] = "Reims";
        System.out.println(Arrays.toString(villes));
    }
}
