import java.util.Scanner;
public class grade_calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter marks obtained (0-100): ");
        int marks = sc.nextInt();

        // Using nested ternary operators to determine the grade
        String grade = (marks >= 70) ? "A (First Class)" :
                (marks >= 60) ? "B (Upper Second Class - 2:1)" :
                (marks >= 50) ? "C (Lower Second Class - 2:2)" :
                (marks >= 40) ? "D (Third Class / Pass)" :
                "F (Fail)";

        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + grade);

        sc.close();
    }
}
 