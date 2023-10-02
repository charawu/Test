import java.util.Random;

public class Test_7 {
    public static void main(String[] args) {

        Random ra = new Random();
        int sum = 0;
        long average;
        int count = 0;

        int[] arr = new int[100];

        for (int i = 0; i < 100; i++) {

            arr[i] = ra.nextInt(100) + 1;
            sum = sum + arr[i];
        }

        average = sum / arr.length; //必须先计算平均数才能求count

        for (int o = 0; o < 100; o++) {

            if (arr[o] < average) {
                count++;
            }
        }

        System.out.println("和为" + sum);
        System.out.println("平均值" + average);
        System.out.println("比平均值小的数字有" + count + "个");
    }
}