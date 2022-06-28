package baseball.feedback;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ValidationUtilsTest {

    @Test
    @DisplayName("check 1 to 9 number")
    void validationUtilsTest(){
        assertThat(ValidationUtils.validNum(9)).isTrue();
        assertThat(ValidationUtils.validNum(1)).isTrue();
        assertThat(ValidationUtils.validNum(0)).isFalse();
        assertThat(ValidationUtils.validNum(10)).isFalse();
    }
}
