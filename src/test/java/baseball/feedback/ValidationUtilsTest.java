package baseball.feedback;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ValidationUtilsTest {

    @Test
    @DisplayName("숫자 1~9 검증")
    void validNum(){
        boolean rightBoundary = ValidationUtils.validNum(9);
        boolean leftBoundary = ValidationUtils.validNum(1);
        boolean leftBoundaryOver = ValidationUtils.validNum(0);
        boolean rightBoundaryOver = ValidationUtils.validNum(11);
        boolean result = ValidationUtils.validNum(5);
        assertThat(leftBoundary).isTrue();
        assertThat(rightBoundary).isTrue();
        assertThat(leftBoundaryOver).isFalse();
        assertThat(rightBoundaryOver).isFalse();
        assertThat(result).isTrue();
    }
}
