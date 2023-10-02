public class Test_3 {
    public static void main(String[] args) {

        int[] arry = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int temp = 0;

        for (int i = 0; i < arry.length; i++) {

            if (arry[i] % 2 == 0) {
                System.out.println(arry[i] / 2);
            } else {
                System.out.println(arry[i] * 2);
            }
        }
    }
}
