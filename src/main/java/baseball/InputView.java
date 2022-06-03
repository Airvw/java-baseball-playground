package baseball;

import java.io.InputStream;
import java.util.Scanner;

public class InputView {
    private Scanner scanner;

    public InputView(InputStream inputStream){
        this.scanner = new Scanner(inputStream);
    }

    public int getInput(){
        System.out.print("숫자를 입력해 주세요 : ");
        int inputValue = Integer.parseInt(scanner.nextLine());
        return inputValue;
    }

    public int restart(){
        System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
        int inputValue = Integer.parseInt(scanner.nextLine());
        return inputValue;
    }
}
