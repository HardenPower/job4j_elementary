package ru.job4j.array;

public class Check {
    public static boolean mono(boolean[] data) {
        boolean result = true;
        for (boolean check : data) {
            boolean leader = data[0];
            if (leader != check) {
                result = false;
                break;
            }
        }
        return result;
    }
}