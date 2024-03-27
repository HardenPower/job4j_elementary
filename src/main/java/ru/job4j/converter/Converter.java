package ru.job4j.converter;

public class Converter {
    public static float rubleToEuro(float value) {
        return value / 70;
    }

    public static float rubleToDollar(float value) {
        return value / 60;
    }

    public static void main(String[] args) {
        float input = 4200;
        float expectedDollar = 70;
        float expectedEuro = 60;
        float outputDollar = rubleToDollar(input);
        float outputEuro = rubleToEuro(input);
        boolean passedDollar = expectedDollar == outputDollar;
        boolean passedEuro = expectedEuro == outputEuro;
        System.out.println("4200 rubles are 70 Dollars. Test result : " + passedDollar);
        System.out.println("4200 rubles are 60 Euro. Test result : " + passedEuro);
    }
}
