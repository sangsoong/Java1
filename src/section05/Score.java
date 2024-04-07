package section05;

public class Score {
    private int score;

    // Constructor
    Score() {
        score = 0;
    }

    // Overloaded Constructor
    Score(int score) {
        this.score = score;
    }

    // Setter
    public void setScore(int score) {
        this.score = score;
    }

    // Getter
    public int getScore() {
        return score;
    }

    // Method
    public int addScore(int val) {
        score += val;

        return score;
    }

    // Overloaded Method
    public int addScore(int[] vals) {
        for (int val : vals) {
            score += val;
        }

        return score;
    }

}