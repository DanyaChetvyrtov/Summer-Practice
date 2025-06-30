package ru.danil.algos.solutions.task2;

import java.util.*;


/**
 * Введите числа для первого списка через пробел: <br>
 * 10 20 30 40 50 60 70 80 90 100<br>
 * Максимальное число: 100<br>
 * Среднее арифметическое: 55.0<br>
 * Отсортированный список: 10 20 30 40 50 60 70 80 90 100<br>
 * Уникальные элементы: 10 20 30 40 50 60 70 80 90 100<br>
 */
public final class ListAnalyzer {
    public static void analyze(List<Integer> nums) {
        System.out.println("All els: " + nums);
        System.out.println("Max el: " + findMax(nums));
        System.out.println("Average: " + findAverage(nums));
//        nums.sort(Comparator.naturalOrder());
        System.out.println("Sorted: " + nums.stream().sorted().toList());
        System.out.println("Unique els: " + findUnique(nums));
    }

    public static int findMax(List<Integer> nums) {
        return Collections.max(nums);
    }

    public static double findAverage(List<Integer> nums) {
        var totalSum = nums.stream().reduce(0, Integer::sum);
        return totalSum / (double) nums.size();
    }

    public static List<Integer> findUnique(List<Integer> nums) {
        Map<Integer, Integer> map = new HashMap<>();
        nums.forEach(num -> map.put(num, map.getOrDefault(num, 0) + 1));

        var result = new ArrayList<Integer>();
        map.forEach((k, v) -> {
            if (v == 1) result.add(k);
        });

        return result;
    }

    public static List<Integer> union(List<Integer> firstList, List<Integer> secondList) {
        Set<Integer> set = new HashSet<>();
        set.addAll(firstList);
        set.addAll(secondList);

        return set.stream().toList();
    }
}
