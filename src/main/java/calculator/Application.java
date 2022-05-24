package calculator;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Application {
    private Scanner scanner;
    private PrintStream printStream;

    public Application(InputStream inputStream, PrintStream printStream){
        this.scanner = new Scanner(inputStream);
        this.printStream = printStream;
    }

    public static int main(String[] args) {
        Application application = new Application(System.in, System.out);
        String value = application.scanner.nextLine();
        String[] values = value.split(" ");

//      입력 형식 거르기 -> 나중에 추가
        Calculator calculator = new StringCalculator(values);
        int result = calculator.Calculate();

        return result;
    }
}
