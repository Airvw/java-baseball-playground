package study;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

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
        assertThat(actual).contains("1", "2");
        assertThat(actualExactly).containsExactly("1");
    }

    @Test
    void substring(){
        String actual = "(1,2)".substring(0,4);
        assertThat(actual).contains("1,2");
    }

    @Test
    void charAt(){
        char actual0 = "abc".charAt(0);
        char actual1 = "abc".charAt(1);
        char actual2 = "abc".charAt(2);
        int index = 5;
        assertThat(actual0).isEqualTo('a');
        assertThat(actual1).isEqualTo('b');
        assertThat(actual2).isEqualTo('c');
        assertThatThrownBy(() -> {char actualError = "abc".charAt(index);}).isInstanceOf(IndexOutOfBoundsException.class)
                .hasMessageContaining("%d", index);
//        assertThatExceptionOfType(IndexOutOfBoundsException.class).isThrownBy(() -> {char actualError = "abc".charAt(index);})
//                .withMessageMatching("Index: \\d+, Size: \\d+", index, "abc".length());

    }
}
