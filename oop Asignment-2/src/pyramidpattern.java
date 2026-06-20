import java.util.Scanner;
public class pyramidpattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        for (int i = 1; i <= rows; i++) {
            // Print leading spaces
            for (int s = 1; s <= rows - i; s++) {
                System.out.print(" ");
            }
            // Print stars (2*i - 1 stars per row)
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        sc.close();
    }
}
