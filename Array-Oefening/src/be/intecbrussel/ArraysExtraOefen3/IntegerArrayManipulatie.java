package be.intecbrussel.ArraysExtraOefen3;

public class IntegerArrayManipulatie {
    public IntegerArrayManipulatie(){

    }

    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3,4,5,6,7,8,9,10};
        int[] nums2 = new int[]{1,2,3,4,5,6,7,8,9,10};
        System.out.println("Positie Number 2 is =  "+ nums[3]);
        System.out.println("Positie Number 6 is =  "+ nums2[7]);
        System.out.println("Positie Number 0 > 7");

        int a;
        for (a=0;a<nums.length;++a){
            if(a<5){
                System.out.println(nums[a]);
            }
        }
        System.out.println("Vervang de deling 4 door 0");

        for (a=0; a < nums.length; ++a){
            if (nums[a]*4==16){
                nums[a]=0;
            }
            System.out.println(nums[a]);
        }
        System.out.println("Foreach Loop");
        int[]var7 = nums2;
        int var4 = nums2.length;

        for(int var5 = 0;var5<var4;++var5){
            int num = var7[var5];
            System.out.println(num);
        }
        System.out.println("Begin achteraan array");

        for(a = nums2.length -1;a>=0;--a){
            System.out.println(nums2[a]);
        }
        System.out.println("Telkens * 13 met Alles ");

        for(a=nums2.length -1;a>=0;--a){
            System.out.println(nums2[a]*13);
        }
    }
}
