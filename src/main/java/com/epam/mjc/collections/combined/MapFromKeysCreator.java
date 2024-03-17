package com.epam.mjc.collections.combined;

import java.util.*;

public class MapFromKeysCreator {
    public Map<Integer, Set<String>> createMap(Map<String, Integer> sourceMap) {
        Map<Integer, Set<String>> resultMap = new HashMap<>();
        for (Map.Entry<String, Integer> entry : sourceMap.entrySet()) {
            int keyLen=entry.getKey().length();
            resultMap.put(keyLen, new HashSet<>());
        }

        for (Map.Entry<Integer, Set<String>> result:resultMap.entrySet()) {
            for (Map.Entry<String, Integer> entry : sourceMap.entrySet()) {
                if (entry.getKey().length() == result.getKey()) {
                    Set<String> set=result.getValue();
                    set.add(entry.getKey());
                    result.setValue(set);
                }
            }
        }
        return resultMap;
    }
}
