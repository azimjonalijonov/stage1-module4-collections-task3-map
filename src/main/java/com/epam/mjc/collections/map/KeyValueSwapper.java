package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.Map;

public class KeyValueSwapper {
    public Map<String, Integer> swap(Map<Integer, String> sourceMap) {
        Map<String, Integer> map = new HashMap<>();
        if (sourceMap.isEmpty()) {
            return map;
        }
        String key;
        int value;
        for (Integer num : sourceMap.keySet()) {
            key = sourceMap.get(num);
            value = num;
            if (map.containsKey(key)) {
                if (map.get(key) > value) {
                    map.replace(key, value);
                }
            }else {
                map.put(key, value);
            }
        }
        return map;
    }
}
