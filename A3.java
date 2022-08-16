import java.util.Scanner;

public class A3 {
    public static void main(String[] args) {
        System.out.println("Enter the length ");
        Scanner in=new Scanner(System.in);
        double length=in.nextDouble();
        System.out.println("Enter The width");
        double width=in.nextDouble();
        System.out.println("The area of rectangle is :"+(length*width));
        System.out.println("The perimeter of a rectangle is :"+(2*(length+width)));

    }
}
