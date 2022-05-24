package calculator;

public interface Calculator {

    int Calculate();

    default int add(int a, int b){
        return a + b;
    }

    default int minus(int a, int b){
        return a - b;
    }

    default int multiple(int a, int b){
        return a * b;
    }

    default int divide(int a, int b){
        return a / b;
    }
}
