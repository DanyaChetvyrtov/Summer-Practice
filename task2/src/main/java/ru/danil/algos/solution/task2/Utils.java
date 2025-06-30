package ru.danil.algos.solution.task2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public final class Utils {
    private Utils() {
    }

    public static boolean isNumber(String potentialNumber) {
        for (var character : potentialNumber.toCharArray())
            if (!Character.isDigit(character)) return false;
        return true;
    }

    public static boolean isPrime(int number) {
        for (int i = 2; i <= Math.sqrt(number); i++)
            if (number % i == 0) return false;
        return true;
    }

    public static List<Integer> generateRandomSequence(int size) {
        List<Integer> allNums = new ArrayList<>();
        var randomizer = new Random();

        for (int i = 0; i < size; i++)
            allNums.add(randomizer.nextInt(100));

        return allNums;
    }
}
