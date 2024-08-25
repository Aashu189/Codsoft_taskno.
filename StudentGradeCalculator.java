import java.util.Scanner;

public class StudentGradeCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input student details
        System.out.print("Enter Student Name: ");
        String studentName = scanner.nextLine();
        
        System.out.print("Enter marks for Math: ");
        int mathMarks = scanner.nextInt();
        
        System.out.print("Enter marks for Science: ");
        int scienceMarks = scanner.nextInt();
        
        System.out.print("Enter marks for English: ");
        int englishMarks = scanner.nextInt();
        
        System.out.print("Enter marks for History: ");
        int historyMarks = scanner.nextInt();
        
        System.out.print("Enter marks for Computer Science: ");
        int computerScienceMarks = scanner.nextInt();
        
        // Calculate total, average, and grade
        int totalMarks = mathMarks + scienceMarks + englishMarks + historyMarks + computerScienceMarks;
        double averageMarks = totalMarks / 5.0;
        char grade;
        
        if (averageMarks >= 90) {
            grade = 'A';
        } else if (averageMarks >= 80) {
            grade = 'B';
        } else if (averageMarks >= 70) {
            grade = 'C';
        } else if (averageMarks >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }
        
        // Display the result
        System.out.println("\nStudent Name: " + studentName);
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Marks: " + averageMarks);
        System.out.println("Grade: " + grade);
        
        scanner.close();
    }
}
