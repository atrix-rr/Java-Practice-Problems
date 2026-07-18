import java.util.*;

class Armstrong2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int num = sc.nextInt();

        int D = num, s = 0;

        int d = num % 10;
        s += (d * d * d);
        D = D / 10;

        if (s == num) {
            System.out.println("Armstrong Number");
        } else {
            System.out.println("Not an Armstrong Number");

        }
    }
}