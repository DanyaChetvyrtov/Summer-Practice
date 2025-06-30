package ru.danil.algos.solution.task1;


import ru.danil.algos.solution.ExecutableSolution;

import java.util.Scanner;

import static ru.danil.algos.solution.task1.NumberAnalyzer.*;

// Перед вычислением корня нужно проверить, что число положительное
// 2 корня. Положительный и отрицательный  +

public class Solution implements ExecutableSolution {
    @Override
    public void start() {
        var scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter number(exit to quit): ");
            String userInput = scanner.nextLine();

            if (userInput.equals("exit")) break;

            try {
                var number = Double.parseDouble(userInput);

                printDescription(number);

            } catch (NumberFormatException e) {
                System.out.println("You should enter the number. Not String");
            }
        }
    }

    private void printDescription(double number){
        System.out.println("Number: " + number);
        System.out.println("* " + (number == 0 ?
                "zero neither positive nor negative" :
                isPositive(number) ? "positive" : "negative"));
        System.out.println("* " + (isEven(number) ? "even" : "odd"));
        System.out.println("* " + (isFractional(number) ? "fractional" : "integer"));
        System.out.println("* " + (isPrime(number) ? "prime" : "not prime"));
        System.out.println("* power of 2 is " + getSquare(number));

        if (isPositive(number)) {
            var roots = squareRoot(number);
            System.out.printf("* square roots is (%.2f, %.2f)", roots.negativeRoot(), roots.positiveRoot());
            System.out.println();
        } else if (number == 0.0) {
            System.out.println("* square root is 0.0");
        } else System.out.println("* negative number have no roots");
    }
}
