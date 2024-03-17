package com.epam.mjc.collections.combined;

import java.util.*;

public class LessonsGetter {
    public Set<String> getLessons(Map<String, List<String>> timetable) {
        Map<String, Integer> lessonsCount = new HashMap<>();
        Set<String> getLessons = new HashSet<>();
        for (List<String> lessons : timetable.values()) {
            for (String lesson : lessons) {
                lessonsCount.put(lesson, lessonsCount.getOrDefault(lesson, 0) + 1);
                if (lessonsCount.getOrDefault(lesson, 0) < 2) {
                    getLessons.add(lesson);
                }
            }
        }
        return getLessons;
    }
}
