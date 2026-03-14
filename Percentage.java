import java.util.Scanner;

class Percentage {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the price");
        double price = sc.nextDouble();

        double discount = price * 0.20;
        double finalPrice = price - discount;

        System.out.println("Final price = " + finalPrice);
    }
}