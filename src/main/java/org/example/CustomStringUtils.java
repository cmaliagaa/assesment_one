package org.example;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class CustomStringUtils {

    public String removeDuplicates(String input) {
        Map<String, Integer> counterMap = new LinkedHashMap<>();
        for (int i = 0; i < input.length(); i++) {
            String s = String.valueOf(input.charAt(i));
            counterMap.put(s, 0);
        }
        return String.join("", counterMap.keySet());
    }
}
