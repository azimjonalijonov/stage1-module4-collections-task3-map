package com.epam.mjc.collections.map;

import java.util.LinkedHashMap;
import java.util.Map;

public class WordRepetitionMapCreator {
    public Map<String, Integer> createWordRepetitionMap(String sentence) {
        Map<String, Integer> map = new LinkedHashMap<>();
        if (sentence.isEmpty()) {
            return map;
        } else {
            String[] strings = sentence.split(" ");
            for (int i = 0; i < strings.length; i++) {
                strings[i] = strings[i].toLowerCase().trim();
                if (strings[i].contains(".") || strings[i].contains(",")) {
                    strings[i] = strings[i].substring(0, strings[i].length() - 1);
                }
            }
            for (String e : strings) {
                if (map.containsKey(e)) {
                    map.replace(e, map.get(e) + 1);
                } else {
                    map.put(e, 1);
                }
            }
            return map;
        }
    }
}
