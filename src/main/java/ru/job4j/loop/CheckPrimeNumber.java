package ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int number) {
        boolean prime = number > 1;
        for (int check = 2; check <= number - 1; check++) {
            if (number % check == 0) {
                prime = false;
                break;
            }
        }
        return prime;
    }
}
