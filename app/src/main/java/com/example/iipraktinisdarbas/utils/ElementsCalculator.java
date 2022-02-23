package com.example.iipraktinisdarbas.utils;

public class ElementsCalculator {
    public static int getCharsCount(String inputText) {
        if (inputText != null) {
            return inputText.length();
        }
        return 0;
    }

    public static int getNumbersCount(String userInputText) {
        int count = 0;
        char[] symbolsArray = userInputText.toCharArray();
        for (char c : symbolsArray) {
            if (Character.isDigit(c)) {
                count++;
            }
        }
        return count;
    }
    public static int getWordsCount(String inputText) {
        if (inputText == null || inputText.isEmpty())
            return 0;
        String[] words = inputText.split("\\s+");
        return words.length;
        }
}
