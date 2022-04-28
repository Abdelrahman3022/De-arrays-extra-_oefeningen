package be.intecbrussel.ArraysExtraOefen3;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Temperatuur {
    public Temperatuur(){

    }

    public static void main(String[] args) {
        int [] temperatuur = new int[]{6,3,1,-1,-3,0,-1};
                int sum = 0;

        for(int a = 0;a< temperatuur.length;++a){
            sum = sum+temperatuur[a];
        }
        float gemiddelde =(float) sum/(float) temperatuur.length;
        System.out.printf("Het gemiddelde temperatuur is: %.2f ", gemiddelde);
        System.out.printf("\n Onder het vriespunt\n");

        int[] var4 = temperatuur;
        int var5 = temperatuur.length;

        for(int var6 = 0; var6< var5;++var6){
            int temperatuure = var4[var6];
            if (temperatuure<0){
                System.out.println(temperatuure);
            }
        }
        System.out.println("Vervang de temperatuur op de 6de dag naar -2");
        for(int a=0;a<temperatuur.length; ++a){
            temperatuur[5]=-2;
        }
        System.out.println(Arrays.toString(temperatuur));


    }
}
