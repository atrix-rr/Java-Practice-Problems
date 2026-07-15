import java.util.*;

class SmallestOf3Numbers {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 Numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        double S = Math.min(a, b);

        double smallest = Math.min(S, c);

        System.out.println("Smallest is:" + smallest);

    }
}