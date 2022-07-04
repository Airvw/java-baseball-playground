package baseball.feedback;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import java.util.*;

public class RandomBallsTest {

    private RandomBalls randomBalls;
    private List<Integer> randomBall;

    @BeforeEach
    void setUp(){
        randomBalls = new RandomBalls();
        randomBalls.makeBalls();
        randomBall = randomBalls.getRandomBalls();
    }

    @Test
    @DisplayName("랜덤 Balls 생성")
    void makeBalls(){
        assertThat(randomBall.size()).isEqualTo(3);
        assertThat(randomBall.get(0).equals(randomBall.get(1))).isFalse();
        assertThat(randomBall.get(0).equals(randomBall.get(2))).isFalse();
        assertThat(randomBall.get(1).equals(randomBall.get(2))).isFalse();
    }

}
