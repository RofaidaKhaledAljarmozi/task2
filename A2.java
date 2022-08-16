import java.util.Scanner;
public class A2 {
    public static void main(String[] args) {
        System.out.println("Enter the radius:");
        Scanner in=new Scanner(System.in);
        double radius=in.nextDouble();
        System.out.println("The area of circle="+(3.14*radius*radius));
        System.out.println("The perimeter of circle="+(3.14*2*radius));
    }
}
