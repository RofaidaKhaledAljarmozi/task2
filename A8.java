import java.util.Scanner;

public class A8 {
    public static void main(String[] args) {
        System.out.println("please enter a number:");
        Scanner in=new Scanner(System.in);
        double y=in.nextDouble();
        System.out.println("The square is:"+(y*y));
        System.out.println("The cube is :"+(y*y*y));
        System.out.println("the fourth power is :"+Math.pow(y,4));


    }
}
