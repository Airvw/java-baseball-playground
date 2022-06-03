package baseball;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.in;
import static org.junit.jupiter.api.Assertions.*;

class BaseBallTest {
    private BaseBall baseBall;

    @BeforeEach
    void setUp(){
        baseBall = new BaseBall();
        InputStream inputStream = System.in;
        System.setIn(new ByteArrayInputStream((Integer.toString(baseBall.computerNum)).getBytes()));
        InputView inputView = new InputView(System.in);
        baseBall.setInputView(inputView);
    }

    @Test
    void play() {
        baseBall.play();
        assertThat(baseBall.value).isEqualTo(3);
    }
}