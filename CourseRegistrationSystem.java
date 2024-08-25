import java.util.ArrayList;
import java.util.Scanner;

public class CourseRegistrationSystem {

    private static ArrayList<String> availableCourses = new ArrayList<>();
    private static ArrayList<String> registeredCourses = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // Initialize available courses
        availableCourses.add("Mathematics");
        availableCourses.add("Physics");
        availableCourses.add("Chemistry");
        availableCourses.add("Computer Science");
        availableCourses.add("English");

        boolean exit = false;

        while (!exit) {
            System.out.println("\nStudent Course Registration System");
            System.out.println("1. View Available Courses");
            System.out.println("2. Register for a Course");
            System.out.println("3. View Registered Courses");
            System.out.println("4. Exit");
            System.out.print("Choose an option (1-4): ");
            int choice = scanner.nextInt();
            scanner.nextLine();  
            switch (choice) {
                case 1:
                    viewAvailableCourses();
                    break;
                case 2:
                    registerForCourse();
                    break;
                case 3:
                    viewRegisteredCourses();
                    break;
                case 4:
                    exit = true;
                    System.out.println("Thank you for using the Course Registration System. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please choose a number between 1 and 4.");
            }
        }

        scanner.close();
    }

    private static void viewAvailableCourses() {
        System.out.println("\nAvailable Courses:");
        for (int i = 0; i < availableCourses.size(); i++) {
            System.out.println((i + 1) + ". " + availableCourses.get(i));
        }
    }

    private static void registerForCourse() {
        viewAvailableCourses();
        System.out.print("Enter the course number you want to register for: ");
        int courseNumber = scanner.nextInt();
        scanner.nextLine();  // Consume newline

        if (courseNumber > 0 && courseNumber <= availableCourses.size()) {
            String course = availableCourses.get(courseNumber - 1);
            if (!registeredCourses.contains(course)) {
                registeredCourses.add(course);
                System.out.println("You have successfully registered for " + course + ".");
            } else {
                System.out.println("You are already registered for " + course + ".");
            }
        } else {
            System.out.println("Invalid course number.");
        }
    }

    private static void viewRegisteredCourses() {
        System.out.println("\nRegistered Courses:");
        if (registeredCourses.isEmpty()) {
            System.out.println("You have not registered for any courses yet.");
        } else {
            for (String course : registeredCourses) {
                System.out.println("- " + course);
            }
        }
    }
}
