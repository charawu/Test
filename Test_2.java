import java.util.Scanner;


public class Test_2 {
    public static  void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("输入开方数：");
        int qr = sc.nextInt(); //qr=25
        int num1 = 0;
        int num = 0;


        for (int i = 1 ; num<=qr ; i++) {
            num = i *i;
            num1 = i -1;
            System.out.println(num);
        }
        System.out.println("开方后为：" + num1);
    }
}
