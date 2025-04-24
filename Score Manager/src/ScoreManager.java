public class ScoreManager {
    private int[] scores;
    private int currentIndex;

    public ScoreManager(int capacity){
        scores = new int[capacity];
        currentIndex = 0;
    }

    public boolean addScore(int score) {
        if (currentIndex < scores.length) {
            scores[currentIndex] = score;
            currentIndex++;
            return true;
        } else {
            return false;
        }
    }

    public void displayScore() {
        if (currentIndex == 0) {
            System.out.println("No score to display");
        } else {
            System.out.println("Scores: ");
            for (int i = 0; i < currentIndex; i++) {
                System.out.println("Student " + (i + 1) + ": " + scores[i]);
            }
        }
    }

    public double calculateAverage() {
        if (currentIndex == 0) {
            return 0;
        } else {
            int total = 0;
            for (int i = 0; i < currentIndex; i++) {
                total += scores[i];
            }
            return (double) total / currentIndex;
        }
    }

    public void displayMenu(){
        System.out.println("\n===Student Score System===");
        System.out.println("1. Add Score");
        System.out.println("2. View Scores");
        System.out.println("3. Calculate Average Score");
        System.out.println("4. Exit");
        System.out.print("Choose an option: ");
    }
}
