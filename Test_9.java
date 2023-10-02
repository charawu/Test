//随机打乱数组中的数据


import java.util.Random;

public class Test_9 {
    public static void main(String[] args) {
        Random ra = new Random();

        int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};


        for (int i =0 ; i < arr.length ; i++) {

            int ra_num = ra.nextInt(arr.length);
            int temp = arr[i];
            arr[i] = arr[ra_num];
            arr[ra_num] = temp;
        }
        for (int o = 0; o < arr.length; o++) {
            System.out.print(arr[o]);
            System.out.print(",");
        }
    }
}