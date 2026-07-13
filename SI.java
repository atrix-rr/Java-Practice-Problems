import java.util.*;

class SI {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Principle,Rate and Time");
        double P = sc.nextInt();
        double R = sc.nextInt();
        double T = sc.nextInt();

        double I = (P * R * T) / 100;

        System.out.println("Simple Interest :" + I);

    }
}