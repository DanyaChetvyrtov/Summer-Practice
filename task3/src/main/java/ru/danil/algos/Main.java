package ru.danil.algos;

import ru.danil.algos.solutions.ExecutableSolution;
import ru.danil.algos.solutions.SolutionFactory;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        while (true) {
            try {
                System.out.println("""
                        1. String analyzer
                        2. Arrays analyzer
                                            
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
                    default -> throw new IllegalArgumentException();
                };

                solution.start();
            } catch (Exception e) {
                System.out.println("Invalid option");
            }
        }
        sc.close();
    }
}