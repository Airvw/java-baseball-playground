package baseball.feedback;

public class ValidationUtils {
    private static final int MIN_NUM = 1;
    private static final int MAX_NUM = 9;

    public static boolean validNum(int num) {
        return num >= MIN_NUM && num <= MAX_NUM;
    }
}
