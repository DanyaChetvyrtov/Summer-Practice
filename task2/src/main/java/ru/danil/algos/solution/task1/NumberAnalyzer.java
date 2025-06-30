package ru.danil.algos.solution.task1;

/**
 * Консольное приложение, которое по введенному
 * числу, сообщит следующую информацию о нем:
 * <ol>
 * <li>положительное/отрицательное</li>
 * <li>четное/нечетное</li>
 * <li>простое или нет</li>
 * <li>дробное или нет</li>
 * <li>квадрат данного числа</li>
 * <li>квадратный корень из данного числа</li>
 * </ol>
 * Например, пользователь вводит "1", в консоли
 * отображается следующая информация: положительное,
 * нечетное, простое, не дробное, квадрат - 1, корень - 1
 */

public final class NumberAnalyzer {
    private NumberAnalyzer() {
    }

    public static boolean isPositive(double number) {
        // maybe >= 0 🤔
        return number > 0;
    }

    public static boolean isEven(double number) {
        return number % 2 == 0;
    }

    public static boolean isPrime(double number) {
        if (isFractional(number) || number <= 1) return false;

        for (int i = 2; i <= Math.sqrt(number); i++)
            if(number % i == 0) return false;

        return true;
    }

    public static boolean isFractional(double number) {
        return Math.floor(number) != number;
    }

    public static double getSquare(double number) {
        return Math.pow(number, 2);
    }

    public static Roots squareRoot(double number) {
        var root = Math.sqrt(number);
        return new Roots(root, -root);
    }
}
