package baseball;

import java.util.HashMap;
import java.util.Map;

public interface RandomNumber {
    int generate();

    default int makeRandomNum(){
        int num = (int)(Math.random() * 10);
        while(num == 0 || num == 10) {
            num = (int)(Math.random() * 10);
        }
        return num;
    }

    default Map<Integer, Integer> putNum(){
        Map<Integer, Integer> map = new HashMap<>();

        while(map.size() < 3) {
            int tmp = this.makeRandomNum();
            while (map.containsKey(tmp)) {
                tmp = this.makeRandomNum();
            }
            map.put(tmp, 1);
        }
        return map;
    }
}
