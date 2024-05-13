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
}
