package baseball;

import java.util.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class ComputerTest {
    private Computer computer;

    @BeforeEach
    void setUp(){
        computer = new Computer();
    }

    @Test
    void makeRandomNum(){
        assertThat(computer.makeRandomNum()).isGreaterThan(0).isLessThan(10);
    }

    @Test
    void putNum(){
        assertThat(computer.putNum().size()).isEqualTo(3);
    }

    @Test
    void generate() {
        int result = computer.generate();
        List<Integer> list = new ArrayList<>();
        while(result > 0){
            list.add(result % 10);
            result /= 10;
        }
        assertThat(list.get(0)).isNotEqualTo(list.get(1));
        assertThat(list.get(1)).isNotEqualTo(list.get(2));
        assertThat(list.get(0)).isNotEqualTo(list.get(2));
    }
}