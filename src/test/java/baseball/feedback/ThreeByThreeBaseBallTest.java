package baseball.feedback;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

public class ThreeByThreeBaseBallTest {

    private Balls balls;
    private PlayResult result;

    @BeforeEach
    void setUp(){
        balls = new Balls(Arrays.asList(4, 5, 6));
    }

    @Test
    @DisplayName("game over")
    void gameOver(){
        result = balls.play(Arrays.asList(4, 5, 6));
        assertThat(result.isGameOver()).isTrue();
    }

    @Test
    @DisplayName("2strike")
    void strike_2(){
        result = balls.play(Arrays.asList(4, 5, 7));
        assertThat(result.getStrikeCnt()).isEqualTo(2);
        assertThat(result.getBallCnt()).isEqualTo(0);
        assertThat(result.isGameOver()).isFalse();
    }

    @Test
    @DisplayName("3ball")
    void ball_3(){
        result = balls.play(Arrays.asList(6, 4, 5));
        assertThat(result.getBallCnt()).isEqualTo(3);
        assertThat(result.getStrikeCnt()).isEqualTo(0);
        assertThat(result.isGameOver()).isFalse();
    }

    @Test
    @DisplayName("nothing")
    void nothing(){
        result = balls.play(Arrays.asList(7, 8, 9));
        assertThat(result.getStrikeCnt()).isEqualTo(0);
        assertThat(result.getBallCnt()).isEqualTo(0);
        assertThat(result.isGameOver()).isFalse();
    }
}
