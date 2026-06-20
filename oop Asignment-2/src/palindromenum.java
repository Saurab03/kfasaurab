import java.util.Scanner;
public class palindromenum {
        public static boolean isPalindrome(int x) {
        // Negative numbers are not palindromes
        if (x < 0) {
            return false;
        }

        int original = x;
        int reversed = 0;

        while (x != 0) {
            int digit = x % 10;
            reversed = reversed * 10 + digit;
            x /= 10;
        }

        return original == reversed;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int x = sc.nextInt();

        if (isPalindrome(x)) {
            System.out.println(x + " is a Palindrome Number.");
        } else {
            System.out.println(x + " is NOT a Palindrome Number.");
        }

        sc.close();
    }
}
