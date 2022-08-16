import java.util.Scanner;

public class A4 {
    public static void main(String[] args) {
        System.out.println("Enter three numbers:");
        Scanner in=new Scanner(System.in);
        int num1=in.nextInt();
        int num2=in.nextInt();
        int num3=in.nextInt();
        System.out.println("The average is: "+((num1+num2+num3)/3));

    }
}
