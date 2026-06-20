
import java.util.Scanner;

public class fitness {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] steps = new int[7];
        int total = 0;
        int highest = 0;

        for (int i = 0; i < 7; i++) {
            System.out.print("Enter steps walked on Day " + (i + 1) + ": ");
            steps[i] = sc.nextInt();
            total += steps[i];

            if (steps[i] > highest) {
                highest = steps[i];
            }
        }

        double average = total / 7.0;

        System.out.println("\n--- Fitness Summary ---");
        System.out.println("Total Steps: " + total);
        System.out.printf("Average Steps: %.2f\n", average);
        System.out.println("Highest Steps in a Day: " + highest);

        sc.close();
    }
}
 