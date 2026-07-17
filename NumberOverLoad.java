import java.util.Scanner;

class NumberOverLoad {

    // Overloaded Method 1: Check karne ke liye ki number Positive hai ya Negative
    static void check(int num) {
        if (num >= 0) {
            System.out.println(num + " is Positive.");
        } else {
            System.out.println(num + " is Negative.");
        }
    }

    // Overloaded Method 2: Character check karne ke liye (Vowel ya Consonant)
    static void check(char ch) {
        // Character ko lowercase me convert kar lete hain taaki check karna aasan ho
        char lowercaseCh = Character.toLowerCase(ch);

        if (lowercaseCh == 'a' || lowercaseCh == 'e' || lowercaseCh == 'i' || lowercaseCh == 'o'
                || lowercaseCh == 'u') {
            System.out.println(ch + " is a Vowel.");
        } else if (Character.isLetter(lowercaseCh)) {
            System.out.println(ch + " is a Consonant.");
        } else {
            System.out.println(ch + " is not a letter.");
        }
    }

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        System.out.println("--- MENU ---");
        System.out.println("1. Check Number (Positive/Negative)");
        System.out.println("2. Check Character (Vowel/Consonant)");
        System.out.print("Enter choice (1 or 2): ");
        int choice = in.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter an integer: ");
                int n = in.nextInt();
                check(n); // int wala method call hoga
                break;

            case 2:
                System.out.print("Enter a character: ");
                char c = in.next().charAt(0);
                check(c); // char wala method call hoga
                break;

            default:
                System.out.println("Wrong choice entered!");
        }
        in.close();
    }
}