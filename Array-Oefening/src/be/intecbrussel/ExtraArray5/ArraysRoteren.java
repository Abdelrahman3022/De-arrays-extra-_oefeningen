package be.intecbrussel.ExtraArray5;

import java.util.Arrays;

public class ArraysRoteren {
    public ArraysRoteren() {
    }

    public static void main(String[] args) {
        int[] random = new int[]{22,33,44,55,66,77,88};
        System.out.printf(Arrays.toString(random) + "\n");
        int element = random.length;
        int achterElement = random[element - 1];

        for (int tata = element - 1; tata > 0; --tata) {
            random[tata] = random[tata - 1];
        }

        random[0] = achterElement;
        System.out.printf(Arrays.toString(random));

    }
}

