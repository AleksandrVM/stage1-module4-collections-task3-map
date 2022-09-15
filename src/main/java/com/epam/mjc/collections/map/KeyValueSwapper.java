package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.Map;

public class KeyValueSwapper {
    public Map<String, Integer> swap(Map<Integer, String> sourceMap) {
        Map<String, Integer> swapping = new HashMap<>();

        for (Map.Entry<Integer, String> entry: sourceMap.entrySet()){
            if (swapping.containsKey(entry.getValue())){
                swapping.put(entry.getValue(), Math.min(swapping.get(entry.getValue()), entry.getKey()));
            }
            else swapping.put(entry.getValue(), entry.getKey());
        }
        return swapping;
    }
}
