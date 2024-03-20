package ru.job4j.calculator;

public class Fit {
    public static double manWeight(double height) {
        return (height - 100) * 1.15;
    }

    public static double womanWeight(double height) {
        return (height - 110) * 1.15;
    }

    public static void main(String[] args) {
        double manWeight = manWeight(185);
        double womanWeight = womanWeight(160);
        System.out.println(manWeight);
        System.out.println(womanWeight);
    }
}
