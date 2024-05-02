package ru.job4j.calculator;

public class Fit {
    public static double manWeight(double height) {
        return (height - 100) * 1.15;
    }

    public static double womanWeight(double height) {
        return (height - 110) * 1.15;
    }

    public static void main(String[] args) {
        int heightMan = 187;
        int heightWoman = 170;
        double man = Fit.manWeight(heightMan);
        double woman = Fit.womanWeight(heightWoman);
        System.out.printf("Man %d is %.2f%n", heightMan, man);
        System.out.printf("Woman %d is %.2f%n", heightWoman, woman);
    }
}
