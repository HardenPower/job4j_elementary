package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        int step1 = x2 - x1;
        int step2 = y2 - y1;
        double step3 = Math.pow(step1, 2);
        double step4 = Math.pow(step2, 2);
        double step5 = step3 + step4;
        return Math.sqrt(step5);
    }

    public static void main(String[] args) {
        double result = Point.distance(0, 0, 2, 0);
        System.out.println("result (0, 0) to (2, 0) " + result);
    }
}
