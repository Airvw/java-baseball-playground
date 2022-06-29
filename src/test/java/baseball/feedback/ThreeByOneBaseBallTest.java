package baseball.feedback;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.Arrays;
import java.util.stream.IntStream;

import static org.assertj.core.api.Assertions.assertThat;

public class ThreeByOneBaseBallTest {

    private Balls balls;

    @BeforeEach
    void setUp() {
        balls = new Balls(Arrays.asList(4, 5, 6));
    }

    @ParameterizedTest
    @CsvSource(value = {"0:4", "1:5", "2:6"}, delimiter = ':')
    @DisplayName("balls test")
    void ballsTest(int position, int ballNum){
        assertThat(balls.getBallList().get(position).getBallNum()).isEqualTo(ballNum);
    }

    @Test
    @DisplayName("strike")
    void strike(){
        assertThat(balls.play(new Ball(1, 4))).isEqualTo(BallStatus.STRIKE);
    }

    @Test
    @DisplayName("ball")
    void ball(){
        assertThat(balls.play(new Ball(2, 6))).isEqualTo(BallStatus.BALL);
    }

    @Test
    @DisplayName("nothing")
    void nothing(){
        assertThat(balls.play(new Ball(2, 7))).isEqualTo(BallStatus.NOTHING);
    }
}
