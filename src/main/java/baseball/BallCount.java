package baseball;

import java.util.Map;

public interface BallCount {

    boolean count(boolean isStrike);

    default boolean ballCheck(Map<Integer, Integer> map, int key, int idx){
        boolean isStrike = false;
        if(map.get(key) == idx){
            isStrike = true;
        }

        return isStrike;
    }
}
