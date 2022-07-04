package baseball.feedback;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import java.util.*;

public class ValidationUtilsTest {

    private List<Integer> randomBall;
    private int randomNum1 = 9;
    private int randomNum2 = 2;

    @BeforeEach
    void setUp(){
        randomBall = new ArrayList<>();
        randomBall.add(9);
    }

    @Test
    @DisplayName("check 1 to 9 number")
    void validationUtilsTest(){
        assertThat(ValidationUtils.validNum(9)).isTrue();
        assertThat(ValidationUtils.validNum(1)).isTrue();
        assertThat(ValidationUtils.validNum(0)).isFalse();
        assertThat(ValidationUtils.validNum(10)).isFalse();
    }

    @Test
    @DisplayName("서로 다른 수 인지 확인")
    void isNotSameNumTest(){
        assertThat(ValidationUtils.isNotSameNum(randomBall, randomNum1)).isFalse();
        assertThat(ValidationUtils.isNotSameNum(randomBall, randomNum2)).isTrue();
    }
}
