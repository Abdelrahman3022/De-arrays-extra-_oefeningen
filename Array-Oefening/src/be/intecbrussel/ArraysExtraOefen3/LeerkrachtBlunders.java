package be.intecbrussel.ArraysExtraOefen3;

import java.util.Arrays;

public class LeerkrachtBlunders {
    public LeerkrachtBlunders() {

    }

    public static void main(String[] args) {
        int[] studentPoints = new int[]{1,5,6,-9,77,110,-4,3,10,2};

        for (int a = 0; a< studentPoints.length;++a){
            if (studentPoints[a]>10){
                studentPoints[a]/=11;

            }else if (studentPoints[a]<0){
                studentPoints[a]=-studentPoints[a];

            }else if (studentPoints[a]<3){
                studentPoints[a]*=3;

            }
        }
        System.out.println("Leerkracht blunders :-");
        System.out.println(Arrays.toString(studentPoints));
    }
}

