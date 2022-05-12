package study;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.*;

@DisplayName("String")
public class StringTest {

    @Test
    void replace() {
        String actual = "abc".replace("b", "d");
        assertThat(actual).isEqualTo("adc");
    }

    @Test
    void split(){
        String[] actual = "1,2".split(",");
        String[] actualExactly = "1".split(",");
        assertThat(actual).contains("1","2");
        assertThat(actualExactly).containsExactly("1");
    }

    @Test
    void substring(){
        String actual = "(1,2)".substring(1,4);
        assertThat(actual).contains("1,2");
    }

    @Test
    @DisplayName("\"abc\" charAt Test with StringIndexOutOfBoundsException")
    void charAt() {
        String str = "abc";
        char actual0 = str.charAt(0);
        char actual1 = str.charAt(1);
        char actual2 = str.charAt(2);
        int outOfIndex = 5;
        assertThat(actual0).isEqualTo('a');
        assertThat(actual1).isEqualTo('b');
        assertThat(actual2).isEqualTo('c');
        assertThatThrownBy(() -> {
            char actualError = str.charAt(outOfIndex);
        }).isInstanceOf(StringIndexOutOfBoundsException.class)
                .hasMessageContaining("range: %d", outOfIndex);
        assertThatExceptionOfType(StringIndexOutOfBoundsException.class)
                .isThrownBy(() -> {char actualError = str.charAt(outOfIndex);})
                .withMessage("String index out of range: %d", outOfIndex);
    }
}
