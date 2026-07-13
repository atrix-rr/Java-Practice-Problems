import java.util.*;

class AreaOfCircle {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Radius");
        double R = sc.nextInt();

        double A = Math.PI * R * R;

        System.out.println("Area is:" + A);
    }
}