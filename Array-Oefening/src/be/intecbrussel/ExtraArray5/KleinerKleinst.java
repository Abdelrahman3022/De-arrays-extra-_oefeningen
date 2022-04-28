package be.intecbrussel.ExtraArray5;

import java.util.Arrays;
import java.util.Random;

public class KleinerKleinst {
    public KleinerKleinst(){


    }

    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[10];

        int smaller;
        for(smaller = 0; smaller < array.length; ++smaller) {
            array[smaller] = random.nextInt(20);
        }

        System.out.println(Arrays.toString(array));

        smaller = array[0];
        int smaller1 = 0;

        for(int a = 0; a < array.length; ++a) {
            if (array[a] < smaller) {
                smaller1 = smaller;
                smaller = array[a];
            } else if (array[a] < smaller1 && array[a] > smaller) {
                smaller1 = array[a];
            }
        }

        System.out.println("De smallest 1 is " + smaller);
        System.out.println("De smallest 2 is " + smaller1);
    }


}
