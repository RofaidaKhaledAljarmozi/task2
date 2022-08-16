import java.util.Scanner;

public class A9 {
    public static void main(String[] args) {
        System.out.println("Please enter 2 integer numbers:");
        Scanner in=new Scanner(System.in);
        int num1,num2;
        num1=in.nextInt();
        num2=in.nextInt();
        System.out.println("The sum is :"+(num1+num2));
        System.out.println("The difference is :"+(num1-num2));
        System.out.println("The product is :"+(num1*num2));
        System.out.println("The average is :"+((num1+num2)/2));
        System.out.println("The distance is "+(Math.abs(num1-num2)));
        System.out.println("The maximum is :"+Math.max(num1,num2));
        System.out.println("The minimum is :"+Math.min(num1,num2));


    }
}
