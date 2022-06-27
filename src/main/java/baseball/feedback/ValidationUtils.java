package baseball.feedback;

public class ValidationUtils {

    public static boolean validNum(int num) {
        if(num >= 1 && num <= 9) return true;

        return false;
    }
}
