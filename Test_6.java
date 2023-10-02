public class Test_6 {
    public static void main(String[] args) {

        int [] arr = {1,2,3,4,5,6,7,8,9,10};
        int os = 0;
        int js = 0;

        for (int i = 0 ; i < arr.length ; i++) {

            if (arr[i] % 2 == 0) {
                os = arr[i] / 2;
                System.out.println("偶数：" + os);
            }else{
                js = arr[i] * 2;
                System.out.println("奇数：" + js);
            }
        }
    }
}
