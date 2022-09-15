package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.Map;

public class WordRepetitionMapCreator {
    private static final String regex = "\\s*[^(a-zA-Z_0-9)]+\\s*";
    public Map<String, Integer> createWordRepetitionMap(String sentence) {
        if (!validate(sentence))
            return new HashMap<>();

        String[] words = sentence.toLowerCase().split(regex);

        Map<String, Integer> duplicateWordCounter = new HashMap<>();
        for (String word : words) {
            if (word.isEmpty())
                continue;
            if (duplicateWordCounter.containsKey(word)) {
                int count = duplicateWordCounter.get(word);
                duplicateWordCounter.put(word, ++count);
            } else duplicateWordCounter.put(word, 1);
        }
        return duplicateWordCounter;
    }

    private boolean validate(String sentence) {
        return !(sentence == null || sentence.isEmpty());
    }
}
