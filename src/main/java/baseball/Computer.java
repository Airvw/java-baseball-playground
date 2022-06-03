package baseball;

import java.util.HashMap;
import java.util.Map;

public class Computer implements RandomNumber{

    @Override
    public int generate(){
        int computerNum = 0;
        Map<Integer, Integer> map = putNum();
        int idx = 1;
        for(int key : map.keySet()){
            computerNum += key * map.get(key) * idx;
            idx *= 10;
        }
        return computerNum;
    }
}
