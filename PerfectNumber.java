import java.util.*;

class PerfectNumber {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number");
        int num = sc.nextInt();

        int s = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                s += i;
                if (s == num) {
                    System.out.println("Perfect Number");
                } else {
                    System.out.println("Not a Perfect Number");

                }
            }
        }

    }
}