package baseball;

import java.io.InputStream;
import java.io.PrintStream;

public class BaseBall {

    private Computer computer = new Computer();
    public int computerNum = computer.generate();
    private InputView inputView;
    private ResultView resultView = new ResultView();
    private CheckSystem checkSystem = new CheckSystem();
    public int value;

    public void setInputView(InputView inputView) {
        this.inputView = inputView;
    }

    public void play(){
        int replay;
        value = inputView.getInput();
        while(!checkSystem.check(computerNum, value)){
            value = inputView.getInput();
        }

        value = checkSystem.getStrikeCnt();
        resultView.result(checkSystem.getBallCnt(), checkSystem.getStrikeCnt());
        resultView.correct();
        replay = inputView.restart();
        if(replay == 1){
            computerNum = computer.generate();
            this.play();
        }
    }

}
