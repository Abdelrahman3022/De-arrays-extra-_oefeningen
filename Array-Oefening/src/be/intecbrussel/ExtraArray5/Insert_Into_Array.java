package be.intecbrussel.ExtraArray5;

import java.util.Arrays;

public class Insert_Into_Array {
    public Insert_Into_Array(){

    }

    public static void main(String[] args) {
        int [] random = new int[]{2,2,2,2};
        int [] newArray = new int[random.length+1];

        int valAdd1=11;
        int valAdd2=2;
        System.out.println(Arrays.toString(random)+"\n");

        for(int dada = 0;dada<newArray.length;++dada)
        {
            if (dada<valAdd2){
                newArray[dada]=random[dada];
            }
            else if (dada==valAdd2)
            {
                newArray[dada]=valAdd1;
            }
            else
            {
                newArray[dada]=random[dada-1];
            }
        }
        System.out.println(Arrays.toString(newArray));
    }
}
