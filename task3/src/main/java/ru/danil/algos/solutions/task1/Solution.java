package ru.danil.algos.solutions.task1;

import ru.danil.algos.solutions.ExecutableSolution;

import java.nio.charset.StandardCharsets;
import java.util.Map;
import java.util.Scanner;

/**
 * консольное приложение, которое считает общее
 * кол-во слов, общее кол-во букв, кол-во гласных, кол-во
 * согласных, кол-во знаков препинания во введенной строке,
 * кол-во пробелов<br><br>
 * Например, пользователь вводит "Привет мир
 * программирования! Я так рад тебя видеть.", в консоли
 * отображается следующая информация:<br><br>
 * "<br>
 * Кол-во слов: 8<br>
 * Кол-во букв: 42<br>
 * ...<br>
 * Кол-во знаков препинания: 2<br>
 * Кол-во пробелов: 7<br>
 * "<br>
 */

/**
 * Получилось нормально запустить уже сам jar-ник.
 * Перед его запуском ток нужно прописать в консоли chcp 65001
 * это типа переключает консоль в UTF-8. (не работало с git bash)
 */
public class Solution implements ExecutableSolution {
    @Override
    public void start() {
        Scanner sc = new Scanner(System.in, StandardCharsets.UTF_8);

        while (true) {
            System.out.println("Enter the string to be analysed (exit to quit): ");

            var userInput = sc.nextLine();
            if (userInput.equals("exit")) break;

            Map<String, Long> stringAnalyses = StringAnalyzer.analyze(userInput);

            System.out.println("Your string: " + userInput);
            System.out.println("String analyses: ");
            stringAnalyses.forEach((key, value) ->
                    System.out.println(key + ": " + value)
            );
            System.out.println();
        }
    }
}
