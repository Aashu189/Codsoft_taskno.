import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class QuizApplication {

    private static Scanner scanner = new Scanner(System.in);
    private static int score = 0;
    private static int timeLimit = 10; // Time limit for each question in seconds
    private static boolean timeOut = false;

    public static void main(String[] args) {
        System.out.println("Welcome to the Quiz Application!");
        System.out.println("You will have " + timeLimit + " seconds to answer each question.");
        System.out.println("Let's start the quiz!\n");

        askQuestion("What is the capital of France?", "Paris");
        askQuestion("What is the square root of 64?", "8");
        askQuestion("Who wrote 'Romeo and Juliet'?", "Shakespeare");
        askQuestion("What is the chemical symbol for water?", "H2O");

        System.out.println("\nQuiz Completed!");
        System.out.println("Your final score is: " + score + " out of 4");

        scanner.close();
    }

    private static void askQuestion(String question, String correctAnswer) {
        Timer timer = new Timer();
        timeOut = false;

        System.out.println(question);
        TimerTask task = new TimerTask() {
            public void run() {
                timeOut = true;
                System.out.println("\nTime's up! Moving to the next question.");
            }
        };
        
        timer.schedule(task, timeLimit * 1000); // Time limit in milliseconds

        String userAnswer = scanner.nextLine();

        if (!timeOut) {
            timer.cancel();
            if (userAnswer.equalsIgnoreCase(correctAnswer)) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Wrong! The correct answer is: " + correctAnswer);
            }
        }
    }
}
