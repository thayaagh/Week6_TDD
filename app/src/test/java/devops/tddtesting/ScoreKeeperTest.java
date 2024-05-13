package devops.tddtesting;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;

public class ScoreKeeperTest {

    private ScoreKeeper scoreKeeper;

    @BeforeEach
    public void setUp() throws Exception {
        scoreKeeper = new ScoreKeeper();
    }

    @Test 
    void initialScoresShouldBeZero() {
        assertEquals(0, scoreKeeper.getScoreTeamA(), "Initial score for Team A should be 0");
        assertEquals(0, scoreKeeper.getScoreTeamB(), "Initial score for Team B should be 0");
    }

    @Test
    void scoreTeamAShouldBeIncreasedByOne() {
        scoreKeeper.scoreTeamA1();
        assertEquals(1, scoreKeeper.getScoreTeamA(), "Score for Team A should be 1");
    }

    @Test
    void scoreTeamBShouldBeIncreasedByOne() {
        scoreKeeper.scoreTeamB1();
        assertEquals(1, scoreKeeper.getScoreTeamB(), "Score for Team B should be 1");
    }

    @Test
    void scoreTeamAShouldBeIncreasedByTwo() {
        scoreKeeper.scoreTeamA2();
        assertEquals(2, scoreKeeper.getScoreTeamA(), "Score for Team A should be 2");
    }

    @Test
    void scoreTeamBShouldBeIncreasedByTwo() {
        scoreKeeper.scoreTeamB2();
        assertEquals(2, scoreKeeper.getScoreTeamB(), "Score for Team B should be 2");
    }

    @Test
    void scoreTeamAShouldBeIncreasedByThree() {
        scoreKeeper.scoreTeamA3();
        assertEquals(3, scoreKeeper.getScoreTeamA(), "Score for Team A should be 3");
    }

    @Test
    void scoreTeamBShouldBeIncreasedByThree() {
        scoreKeeper.scoreTeamB3();
        assertEquals(3, scoreKeeper.getScoreTeamB(), "Score for Team B should be 3");
    }

    @Test
    void shouldReturnScore() {
        scoreKeeper.scoreTeamA1(); // Team A scores 1 point
        scoreKeeper.scoreTeamA2(); // Team A scores 2 additional points, total 3
        scoreKeeper.scoreTeamB2(); // Team B scores 2 points
        scoreKeeper.scoreTeamB1(); // Team B scores 1 additional point, total 3
        String expected = "003:003";
        String actual = scoreKeeper.getScore();
        assertEquals(expected, actual, "The score should be formatted as '003:003'");    
    }

    @Test
    void resetScoreOfBothTeams() {
        scoreKeeper.scoreTeamA1(); // Team A scores 1 point
        scoreKeeper.scoreTeamA2(); // Team A scores 2 additional points, total 3
        scoreKeeper.scoreTeamB2(); // Team B scores 2 points
        scoreKeeper.scoreTeamB1(); // Team B scores 1 additional point, total 3
        scoreKeeper.resetScore();
        assertEquals(0, scoreKeeper.getScoreTeamA(), "Score for Team A should be reset to 0");
        assertEquals(0, scoreKeeper.getScoreTeamB(), "Score for Team B should be reset to 0");
    }
}