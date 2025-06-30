package ru.danil.algos;

import ru.danil.algos.solution.ExecutableSolution;
import ru.danil.algos.solution.SolutionFactory;

import java.util.Scanner;

/**
 * Требования
 * <ul>
 * <li>в качестве UI необходимо использовать консоль</li>
 * <li>взаимодействие с программой должно осуществляться через клавиатуру</li>
 * <li>программа должна корректно работать</li>
 * <li>должна быть предусмотрена защита от неправильных/недопустимых действий</li>
 * <li>все ошибки должны быть обработаны (приложение не должно завершаться с ошибкой ни в каком случае)</li>
 * </ul>
 */


// Был необычный баг с потоком ввода. Когда привыохде из
// какого-то из solution поток закрывался и бесконечно
// выполнялся catch блок
public class Main {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        while (true) {
            try {
                System.out.println("""
                        1. Number analyzer
                        2. Prime numbers founder
                        3. Area calculator
                                            
                        0. exit
                        """);

                var userInput = sc.nextLine();
                if (userInput.equals("0") || userInput.equals("exit")) {
                    System.out.println("Buy");
                    break;
                }

                ExecutableSolution solution = switch (userInput) {
                    case "1" -> SolutionFactory.getSolution1();
                    case "2" -> SolutionFactory.getSolution2();
                    case "3" -> SolutionFactory.getSolution3();
                    default -> throw new IllegalArgumentException();
                };

                solution.start();
            } catch (Exception e) {
                System.out.println("Invalid option");
            }
        }
    }
}