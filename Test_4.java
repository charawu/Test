public class Test_4 {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5};

        int count = 0;

        for (int i = 0 ; i < arr.length ; i++) {

            int temp = arr[i];

            count = temp + arr[i];
        }
        System.out.println(count);
    }
}