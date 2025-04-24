import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner io = new Scanner(System.in);

        System.out.print("Enter the maximum number of students: ");
        int capacity = io.nextInt();
        ScoreManager scoremanager = new ScoreManager(capacity);


        boolean loop = true;
        while (loop) {
            scoremanager.displayMenu();
            int choice = io.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter the student score: ");
                    int score = io.nextInt();
                    boolean add = scoremanager.addScore(score);
                    if (add) {
                        System.out.println("Score added!");
                    } else {
                        System.out.println("Cannot add score. Maximum capacity reached");
                    }
                    break;

                case 2:
                    scoremanager.displayScore();
                    break;

                case 3:
                    double average = scoremanager.calculateAverage();
                    if (average == 0) {
                        System.out.println("No scores available to calculate the average.");
                    } else {
                        System.out.print("Average score: " + average+"\n");
                    }
                    break;

                case 4:
                    System.out.println("Exiting the program. Goodbye!");
                    loop = false;
                    break;

                default:
                    System.out.println("Invalid option. Please try again");
            }
        }

    }
}
