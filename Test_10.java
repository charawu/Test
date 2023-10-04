import java.util.Scanner;


public class Test_10 {
    //这是一个main方法主类。
    //主要的运行程序都从这里开始，这也是程序的开始。
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("输入圆1的半径");
        double r1 = sc.nextDouble();
        System.out.println("输入圆2的半径");
        double r2 = sc.nextDouble();

        double area1, area2;

        //这里调用了circle_area方法，通过r获取了面积。
        area1 = circle_area(r1);
        area2 = circle_area(r2);

        if (area1 == area2) {
            System.out.println("圆1面积和圆2面积相等");
        } else if (area1 > area2) {
            System.out.println("圆1的面积更大");
        } else {
            System.out.println("圆2的面积更大");
        }
    }

    //这是一个方法名为”circle_area“，用于计算圆的面积并返回”area“供main方法使用对圆形的面积进行比较。
    public static double circle_area(double r) {
        double pi = 3.14;
        return (pi * (r * r));
    }
}