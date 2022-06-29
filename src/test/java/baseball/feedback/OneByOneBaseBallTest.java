package baseball.feedback;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class OneByOneBaseBallTest {

    private Ball ball;

    @BeforeEach
    void setUp(){
        ball = new Ball(1, 4);
    }

    @Test
    @DisplayName("nothing test")
    void nothing(){
        assertThat(ball.play(new Ball(2, 5))).isEqualTo(BallStatus.NOTHING);
    }

    @Test
    @DisplayName("ball test")
    void ball(){
        assertThat(ball.play(new Ball(2, 4))).isEqualTo(BallStatus.BALL);
    }

    @Test
    @DisplayName("strike test")
    void strike(){
        assertThat(ball.play(new Ball(1, 4))).isEqualTo(BallStatus.STRIKE);
    }
}
