package io.zipcoder;

import java.util.HashMap;
import java.util.Map;

public class Problem4 {

    private Map<Character, Integer> characterMap;

    public Problem4() {
        characterMap = new HashMap<Character, Integer>();
    }


    public String checkForPalindrome(String input) {
        String answer = null;
        buildMap(input);

        if (countOddOccurringCharacters(characterMap) > 1) {
            answer = "NO";
        } else {
            answer = "YES";
        }

        return answer;
    }


    private void buildMap(String input) {
        for (int i = 0; i < input.length(); i++) {
            if (characterMap.containsKey(input.charAt(i))) {
                characterMap.put(input.charAt(i), characterMap.get(input.charAt(i)) + 1);
            } else {
                characterMap.put(input.charAt(i), 1);
            }
        }
    }

    private int countOddOccurringCharacters(Map<Character, Integer> aMap) {
        int countOfOdds = 0;

        for (Map.Entry<Character, Integer> entry : aMap.entrySet()) {
            if (entry.getValue() % 2 != 0) {
                countOfOdds++;
            }
        }
        return countOfOdds;
    }


}
