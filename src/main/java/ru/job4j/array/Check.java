package ru.job4j.array;

public class Check {
    public static boolean mono(boolean[] data) {
        boolean result = true;
        for (int check = 1; check < data.length; check++) {
            if (data[check] != data[0]) {
                result = false;
                break;
            }
        }
        return result;
    }
}