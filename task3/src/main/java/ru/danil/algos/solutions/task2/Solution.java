package ru.danil.algos.solutions.task2;

import ru.danil.algos.solutions.ExecutableSolution;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * консольное приложение, которое принимает два<br>
 * списка чисел и для каждого из списков выводит максимальное<br>
 * число, среднее арифметическое, сортирует в порядке<br>
 * возрастания, выводит уникальные элементы. Также объединяет<br>
 * два списка без дублирования элементов.<br>
 * Например<br> <br>
 * <p>
 * Введите числа для первого списка через пробел: <br>
 * 10 20 30 40 50 60 70 80 90 100<br>
 * Максимальное число: 100<br>
 * Среднее арифметическое: 55.0<br>
 * Отсортированный список: 10 20 30 40 50 60 70 80 90 100<br>
 * Уникальные элементы: 10 20 30 40 50 60 70 80 90 100<br>
 * <br>
 * Введите числа для второго списка через пробел:<br> 1000 100 100 10<br>
 * Максимальное число: 1000<br>
 * Среднее арифметическое: 302,5<br>
 * Отсортированный список: 10 100 100 1000<br>
 * Уникальные элементы: 1000 100 10<br>
 * <br>
 * Объединенный список: 10 20 30 40 50 60 70 80 90 100 1000
 */
public class Solution implements ExecutableSolution {
    @Override
    public void start() {

        var scanner = new Scanner(System.in);
        while (true) {
            try {
                System.out.println();
                System.out.println("Enter first sequence(exit to quit): ");
                var userInput = scanner.nextLine();
                if (userInput.equals("exit")) break;

                var nums1 = numsString2List(userInput);
                ListAnalyzer.analyze(nums1);
                System.out.println();

                // ----------------------------
                System.out.println("Enter second sequence(exit to quit): ");
                userInput = scanner.nextLine();
                if (userInput.equals("exit")) break;

                var nums2 = numsString2List(userInput);
                ListAnalyzer.analyze(nums2);
                System.out.println();

                // ----------------------------
                System.out.println("Sequence union: ");
                System.out.println(ListAnalyzer.union(nums1, nums2));
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. You should enter a natural numbers separated by one space");
                System.out.println();
            }
        }
    }

    private List<Integer> numsString2List(String userInput) {
        return Arrays.stream(userInput.split(" "))
                .mapToInt(Integer::parseInt)
                .boxed()
                .toList();
    }
}
