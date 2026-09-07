import java.util.Scanner;

public class StudentGradeCalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String name = sc.nextLine();

        int total = 0;

        System.out.println("Enter marks for 5 subjects:");

        for (int i = 1; i <= 5; i++) {
            System.out.print("Subject " + i + ": ");
            int marks = sc.nextInt();
            total += marks;
        }

        double percentage = total / 5.0;

        char grade;

        if (percentage >= 90) {
            grade = 'A';
        } else if (percentage >= 80) {
            grade = 'B';
        } else if (percentage >= 70) {
            grade = 'C';
        } else if (percentage >= 60) {
            grade = 'D';
        } else if (percentage >= 50) {
            grade = 'E';
        } else {
            grade = 'F';
        }

        System.out.println("\n===== Result =====");
        System.out.println("Student: " + name);
        System.out.println("Total Marks: " + total + "/500");
        System.out.println("Percentage: " + percentage + "%");
        System.out.println("Grade: " + grade);

        sc.close();
    }
}

