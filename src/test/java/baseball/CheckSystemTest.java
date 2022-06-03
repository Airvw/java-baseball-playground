package baseball;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.HashMap;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class CheckSystemTest {
    private CheckSystem checkSystem;
    private int computerNum;
    private Map<Integer, Integer> map;
    private ResultView resultView;

    @BeforeEach
    void setUp(){
        checkSystem = new CheckSystem();
        computerNum = 689;
        map = checkSystem.makeMap(computerNum);
        resultView = new ResultView();
    }

    @Test
    void makeMap(){
        assertThat(map.size()).isEqualTo(3);
    }

    @ParameterizedTest
    @CsvSource(value = {"9:1:true", "8:3:false"}, delimiter = ':')
    void ballCheck(int key, int idx, boolean expected){
        assertThat(checkSystem.ballCheck(map,key,idx)).isEqualTo(expected);
    }

    @Test
    void count() {
        boolean isStrike = true;
        assertThat(checkSystem.count(isStrike)).isEqualTo(false);
        assertThat(checkSystem.getStrikeCnt()).isEqualTo(1);
        assertThat(checkSystem.getBallCnt()).isEqualTo(0);
    }

    @ParameterizedTest
    @CsvSource(value = {"689-true", "789-false", "968-false"}, delimiter = '-')
    void check(int value, boolean expected) {
        assertThat(checkSystem.check(computerNum, value)).isEqualTo(expected);
    }
}