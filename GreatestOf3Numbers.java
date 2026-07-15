import java.util.*;

class GreatestOf3Numbers {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a > b && a > c) {
            System.out.println("A ");
        } else if (b > a && b > c) {
            System.out.println("B");

        } else {
            System.out.println("C");
        }
    }
}