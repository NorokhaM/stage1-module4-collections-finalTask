package com.epam.mjc.collections.combined;

import java.util.*;

public class DeveloperProjectFinder {
    public List<String> findDeveloperProject(Map<String, Set<String>> projects, String developer) {
        List<String> result = new ArrayList<>();
        for (Map.Entry<String, Set<String>> entry : projects.entrySet()) {
            if (entry.getValue().contains(developer)) {
                result.add(entry.getKey());
            }
        }
        result.sort(new Comparator<String>(){
            @Override
            public int compare(String s1, String s2) {
                return s1.length()==s2.length() ? s2.compareTo(s1) : s2.length()-s1.length();
            }
        });
        return result;
    }

}
