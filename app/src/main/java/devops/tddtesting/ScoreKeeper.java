package devops.tddtesting;

public class ScoreKeeper {
    private int scoreTeamA = 0;
    private int scoreTeamB = 0;

    // Adds 1 point to Team A's score
    public void scoreTeamA1() {
        scoreTeamA += 1;
    }

    // Adds 1 point to Team B's score
    public void scoreTeamB1() {
        scoreTeamB += 1;
    }
    
    // Adds 2 points to Team A's score
    public void scoreTeamA2() {
        scoreTeamA += 2;
    }

    // Adds 2 points to Team B's score
    public void scoreTeamB2() {
        scoreTeamB += 2;
    }

    // Adds 3 points to Team A's score
    public void scoreTeamA3() {
        scoreTeamA += 3;
    }

    // Get the score for Team A
    public int getScoreTeamA() {
        return scoreTeamA;
    }

    // Get the score for Team B
    public int getScoreTeamB() {
        return scoreTeamB;
    }        
}