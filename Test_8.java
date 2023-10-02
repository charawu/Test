//这是一个没学会的类：数组中的数字顺序交换


public class Test_8 {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,7};
        int[] arr1 = {1,2,3,4,5};

        for (int i = 0 , j = arr.length - 1 ; i < j ; i++ , j--) {

            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            /*int temp1 = arr1[i];
            arr1[i] = arr1[j];
            arr1[j] = temp1;*/
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            //System.out.println(arr1[i]);
        }
    }
}