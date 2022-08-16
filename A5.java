import java.util.Scanner;

public class A5 {
    public static void main(String[] args) {
        System.out.println("Enter the value of x:");
        Scanner in=new Scanner(System.in);
        int x=in.nextInt();
        System.out.println("Enter the value of y:");
        int y=in.nextInt();
        int z=x;
            x=y;
            y=z;
        System.out.println("After swapping x="+x+"\ty="+y);

    }
}
