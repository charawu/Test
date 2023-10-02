import java.util.Random;
import java.util.Scanner;
public class Test_1 {
    public static void main(String[] args) {

        Scanner cs = new Scanner(System.in);

        Random ra= new Random();
        System.out.println("现在有一个随机整数，请猜测它的大小");
        int num = ra.nextInt(100);
        //System.out.println("正确答案是：" + num);

        int gass = cs.nextInt();


        while (gass != num) {
                if (gass < num) {
                    System.out.println("猜小了");
                }else{
                    System.out.println("猜大了");
            }
            gass = cs.nextInt();
        }
        System.out.println("猜对了");
    }
}