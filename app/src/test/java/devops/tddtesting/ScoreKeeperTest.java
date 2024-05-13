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
}
