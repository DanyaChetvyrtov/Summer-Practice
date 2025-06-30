package ru.danil.algos.solutions.task1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * количество слов (* сделать через регулярки)<br>
 * количество букв<br>
 * количество гласных<br>
 * количество согласных<br>
 * количество знаков препинания<br>
 * количество пробелов<br>
 */
public final class StringAnalyzer {

    public static Map<String, Long> analyze(String str) {
        if (str.isEmpty()){
            System.out.println("String is empty");
            return Map.of();
        }

        Map<String, Long> statistic = new HashMap<>();

        for (char character : str.toLowerCase().toCharArray()) {
            if (isLetter(character)) {
                statistic.put("Letters", statistic.getOrDefault("Letters", 0L) + 1);

                if (isVowel(character))
                    statistic.put("Vowels", statistic.getOrDefault("Vowels", 0L) + 1);
                else
                    statistic.put("Consonants", statistic.getOrDefault("Consonants", 0L) + 1);

            } else if (isPunctuation(character))
                statistic.put("Punctuation", statistic.getOrDefault("Punctuation", 0L) + 1);
            else if (character == ' ')
                statistic.put("Spaces", statistic.getOrDefault("Spaces", 0L) + 1);
        }

        var words = extractWords(str);
        var totalAmount = Arrays.stream(words).filter(word -> word.length() > 1 && !isNumber(word)).count();
        statistic.put("Words", totalAmount);

        return statistic;
    }

    private static boolean isLetter(char character) {
        return ('a' <= character && character <= 'z') ||
                ('а' <= character && character <= 'я');
    }

    private static boolean isVowel(char character) {
        return Set.of(
                'a', 'e', 'i', 'o', 'u',
                'и', 'э', 'а', 'о', 'у', 'ы', 'я', 'е', 'ё', 'ю'
        ).contains(character);
    }

    private static boolean isPunctuation(char character) {
        return Set.of(
                '.', ',', ';', ':', '!', '?', '-',
                '\"', '\'', '(', ')', '[', ']', '{', '}'
        ).contains(character);
    }

    // Могут быть траблы со словами через дефис: как-то и т.п.
    private static String[] extractWords(String str) {
        str = str.replaceAll("[^\\p{L}\\p{Nd}'’-]", " ") // заменить всё КРОМЕ(^) букв, цифр и т.п.
                .replaceAll("\\s+", " ") // \s+ 1 или более повторений
                .trim();
        return str.split(" ");
    }

    private static boolean isNumber(String str){
        for(var character: str.toCharArray())
            if(isLetter(character))
                return false;
        return true;
    }
}

