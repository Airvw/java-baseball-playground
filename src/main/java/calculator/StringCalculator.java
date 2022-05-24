package calculator;

import java.util.LinkedList;
import java.util.Queue;

public class StringCalculator implements Calculator{

    private final String[] values;
    private Queue<String> queue = new LinkedList<>();
    private int res = Integer.parseInt(queue.poll());
    private int b;

    public StringCalculator(String[] values) {
        this.values = values;
    }

    @Override
    public int Calculate() {
        for(String value : values){
            queue.add(value);
        }
        res = Integer.parseInt(queue.poll());

        while(!queue.isEmpty()) {
            String operator = queue.poll();
            res = calculateOperator(operator);
        }
        return res;
    }

    private int calculateOperator(String operator){
        if ("+".equals(operator)) {
            b = Integer.parseInt(queue.poll());
            res = add(res, b);
        }
        if("-".equals(operator)){
            b = Integer.parseInt(queue.poll());
            res = minus(res, b);
        }
        if("*".equals(operator)){
            b = Integer.parseInt(queue.poll());
            res = multiple(res, b);
        }
        if("/".equals(operator)) {
            b = Integer.parseInt(queue.poll());
            res = divide(res, b);
        }
        return res;
    }
}
