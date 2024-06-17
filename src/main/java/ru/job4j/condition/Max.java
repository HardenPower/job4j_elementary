package ru.job4j.condition;

public class Max {

    public static int max(int left, int right) {
        return left > right ? left : right;
    }

    public static int max(int left, int middle, int right) {
        return max(left, max(middle, right));
    }

    public static int max(int a, int b, int c, int d) {
        return max(a, max(max(b, c), d));
    }

    public static int max(short left, int right) {
        return left > right ? left : right;
    }

    public static int max(short left, short right) {
        return left > right ? left : right;
    }

    public static void main(String[] args) {
        int result = max(1, 2);
        System.out.println(result);
        result = max(5, 0);
        System.out.println(result);
        result = max(10, 10);
        System.out.println(result);
    }
}
