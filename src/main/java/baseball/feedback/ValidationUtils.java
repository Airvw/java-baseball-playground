package baseball.feedback;

import java.util.*;

public class ValidationUtils {
    private static final int MIN_NUM = 1;
    private static final int MAX_NUM = 9;

    public static boolean validNum(int num) {
        return num >= MIN_NUM && num <= MAX_NUM;
    }

    public static boolean isNotSameNum(List<Integer> randomBall, int randomNum) {
        return randomBall.stream()
                .noneMatch(ballNum -> ballNum == randomNum);
    }

    public static int generateNum() {
        int num = (int)(Math.random() * 10);
        if(validNum(num)) return num;
        return generateNum();
    }

}
