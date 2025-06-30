package ru.danil.algos.solutions;


public class SolutionFactory {
    public static ExecutableSolution getSolution1(){
        return new ru.danil.algos.solutions.task1.Solution();
    }
    public static ExecutableSolution getSolution2(){
        return new ru.danil.algos.solutions.task2.Solution();
    }
}
