package calculator;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

import static org.assertj.core.api.Assertions.assertThat;

public class ApplicationTest {

    private int res;
    private String value = "2 + 3 * 4 / 2";

    @Test
    void mainTest(){
        InputStream inputStream = System.in;
        PrintStream printStream = System.out;
        System.setIn(new ByteArrayInputStream(value.getBytes()));
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(byteArrayOutputStream));

        Application application = new Application(inputStream, printStream);
        assertThat(Application.main(new String[0])).isEqualTo(10);
    }
}
