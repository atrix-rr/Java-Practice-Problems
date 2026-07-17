import java.util.*;

class MenuDriven {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("-----MENU-----");
        System.out.println("1) Area of Circle");
        System.out.println("2) Area of Rectangle");
        System.out.println("3) Area of Square");
        System.out.println("Enter your Choice");
        int ch = sc.nextInt();

        switch (ch) {
            case 1:
                System.out.println("Enter Radius");
                double R = sc.nextDouble();
                double A = 3.14 * R * R;
                System.out.println("Area is:" + A);
                break;

            case 2:
                System.out.println("Enter Length and Breadth");
                double L = sc.nextDouble();
                double B = sc.nextDouble();
                double Ar = L * B;
                System.out.println("Area is:" + Ar);
                break;

            case 3:
                System.out.println("Enter Side");
                double S = sc.nextDouble();
                double a = S * S;
                System.out.println("Area is:" + a);
                break;

            default:
                System.out.println("Invalis choice");

        }
    }
}