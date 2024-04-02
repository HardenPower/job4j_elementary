package ru.job4j.condition;

public class LogicNot {
    public static boolean isEven(int num) {
        return num % 2 == 0;
    }

    public static boolean isPositive(int num) {
        return num > 0;
    }

    public static boolean notEven(int num) {
        return !isEven(num);
    }

    public static boolean notPositive(int num) {
        return !isPositive(num);
    }

    public static boolean notEvenAndPositive(int num) {
        return !isEven(num) && isPositive(num);
    }

    public static boolean evenOrNotPositive(int num) {
        return isEven(num) || notPositive(num);
    }

    public static void main(String[] args) {
        boolean a = isEven(5);
        System.out.println("5 is even? " + a);
        boolean b = isPositive(-2);
        System.out.println("-2 is positive? " + b);
        boolean c = notEven(8);
        System.out.println("8 is't even? " + c);
        boolean d = notPositive(-5);
        System.out.println("-5 is't positive? " + d);
        boolean e = notEvenAndPositive(10);
        System.out.println("10 is not even and positive? " + e);
        boolean f = evenOrNotPositive(-18);
        System.out.println("-18 is even or not positive? " + f);
    }
}
