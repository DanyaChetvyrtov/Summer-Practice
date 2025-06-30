package ru.danil.algos.solution.task2;

import ru.danil.algos.solution.ExecutableSolution;

import java.util.Scanner;


public class Solution implements ExecutableSolution {
    @Override
    public void start() {
        var scanner = new Scanner(System.in);
        int n = 0;

        try {
            while (true) {
                System.out.println("Enter n(exit to quit): ");
                String userInput = scanner.nextLine();

                if (userInput.equals("exit")) return;

                if (Utils.isNumber(userInput) && Integer.parseInt(userInput) > 0) {
                    n = Integer.parseInt(userInput);
                    break;
                }
                System.out.println("Invalid input. You should enter natural number.");
            }
        } catch (NumberFormatException ex) {
            System.out.println("Invalid input. Your number is too large.");
        }

        var allNums = Utils.generateRandomSequence(n);
        System.out.println("All generated numbers: ");
        System.out.println(allNums);

        var primeNums = allNums.stream().filter(Utils::isPrime).toList();
        System.out.println("Prime generated numbers: ");
        System.out.println(primeNums);
    }
}
