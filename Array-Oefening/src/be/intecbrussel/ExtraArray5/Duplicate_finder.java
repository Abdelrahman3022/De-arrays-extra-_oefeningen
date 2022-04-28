package be.intecbrussel.ExtraArray5;

public class Duplicate_finder {
    public Duplicate_finder() {
    }
        public static void main(String[] args) {
            int[] array = new int[]{5, 33, 44, 33, 5, 6, 44, 5, 33, 5, 7, 8, 7, 8, 7};
            int[] count = new int[50];

            int a;
            for(a = 0; a < array.length; ++a) {
                int index1 = array[a];
                int index = count[index1]++;
            }

            for(a = 1; a < count.length; ++a) {
                if (count[a] > 1) {
                    System.out.println(count[a] + " x " + a);
                }
            }

        }


    }

