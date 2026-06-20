import java.util.Scanner;
import java.time.Year;

public class ai_age {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your current age: ");
        int age = sc.nextInt();

        int after10 = age + 10;
        int after25 = age + 25;
        int after50 = age + 50;

        System.out.println("Age after 10 years: " + after10);
        System.out.println("Age after 25 years: " + after25);
        System.out.println("Age after 50 years: " + after50);

        // Bonus: Predict the year they will turn 100
        int currentYear = Year.now().getValue();
        int yearsUntil100 = 100 - age;
        int yearTurning100 = currentYear + yearsUntil100;

        System.out.println("You will turn 100 in the year: " + yearTurning100);

        sc.close();
    }
}
