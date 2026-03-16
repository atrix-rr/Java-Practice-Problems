import java.util.Scanner;

class Smalllest {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("enter the number");
        int num = sc.nextInt();
        int min = 9;

        while(num > 0) {
            int d = num % 10;
            if(d < min)
                min = d;
            num = num / 10;
        }

        System.out.println("Smallest digit = " + min);
    }
}