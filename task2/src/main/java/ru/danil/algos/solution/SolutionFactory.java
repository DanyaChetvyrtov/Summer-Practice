package ru.danil.algos.solution;


public class SolutionFactory {
    public static ExecutableSolution getSolution1(){
        return new ru.danil.algos.solution.task1.Solution();
    }
    public static ExecutableSolution getSolution2(){
        return new ru.danil.algos.solution.task2.Solution();
    }
    public static ExecutableSolution getSolution3(){
        return new ru.danil.algos.solution.task3.Solution();
    }
}
