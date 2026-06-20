import java.util.Scanner;
public class attendence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of classes conducted: ");
        int conducted = sc.nextInt();

        System.out.print("Enter number of classes attended: ");
        int attended = sc.nextInt();

        double percentage = ((double) attended / conducted) * 100;

        System.out.printf("Attendance Percentage: %.2f%%\n", percentage);

        if (percentage >= 75) {
            System.out.println("Eligible for Exam");
        } else {
            System.out.println("Not Eligible");
        }

        sc.close();
    }
}
