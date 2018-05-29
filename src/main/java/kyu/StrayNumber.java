package kyu;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StrayNumber {
    static int stray(int[] numbers) {
        Map<Integer, Integer> counts = new HashMap<>();
    
        for (Integer i : numbers) {
            counts.merge(i, 1, (a, b) -> a + b);
        }
    
        List<Integer> cs = new ArrayList<>(counts.values());
        Collections.sort(cs);
    
        List<Integer> minElements = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : counts.entrySet()) {
            if (entry.getValue().equals(cs.get(0))) {
                minElements.add(entry.getKey());
            }
        }
        
        return minElements.get(0);
        
//better
//        if (numbers[0] != numbers[1] && numbers[0] != numbers[2]) return numbers[0];
//        for (int i : numbers) if (i != numbers[0]) return i;
//        return 0;
    }
}
