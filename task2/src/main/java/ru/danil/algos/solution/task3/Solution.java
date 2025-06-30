package ru.danil.algos.solution.task3;

import ru.danil.algos.solution.ExecutableSolution;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Solution implements ExecutableSolution {
    @Override
    public void start() {

        System.out.println("""
                1. Square
                2. Rectangle
                3. Circle
                """);

        var scanner = new Scanner(System.in);
        while (true) {
            try {
                System.out.println("Choose an option(exit to quit): ");
                var userInput = scanner.nextLine();

                if (userInput.equals("exit")) break;

                switch (userInput) {
                    case "1" -> {
                        System.out.println("Enter square side: ");
                        var side = Double.parseDouble(scanner.nextLine());

                        if(side < 0) throw new IllegalArgumentException("Invalid side");

                        System.out.println("Area is " + Math.pow(side, 2));
                    }
                    case "2" -> {
                        System.out.println("Enter rectangle side a: ");
                        var a = Double.parseDouble(scanner.nextLine());

                        System.out.println("Enter rectangle side b: ");
                        var b = Double.parseDouble(scanner.nextLine());

                        if(a < 0 || b < 0) throw new IllegalArgumentException("Invalid input");

                        System.out.println("Area is " + a * b);
                    }
                    case "3" -> {
                        System.out.println("Enter radius: ");
                        var radius = Double.parseDouble(scanner.nextLine());

                        if(radius < 0) throw new IllegalArgumentException("Invalid radius");

                        System.out.println("Area is " + radius * radius * Math.PI);
                    }
                    default -> System.out.println("BuyBuy");
                }
            } catch (InputMismatchException | IllegalArgumentException e) {
                System.out.println("Invalid input.");
            }
        }
    }
}
