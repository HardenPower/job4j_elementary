package ru.job4j.calculator;

public class MathFunction {
    public static int func1(int x) {
        return x * x + 1;
    }

    public static int func2(int x) {
        return 1 / x;
    }

    public static void main(String[] args) {
        int result1 = MathFunction.func1(3);
        int result2 = MathFunction.func2(5);

        /*
        * warning в checkstyle плагине, если не использовать переменную result3
        * как я понял задание, result3 не учавствует в переменной total при сложении
        * но для исправлении предупреждения в checkstyle - добавил использование result3
        *
        */
        int result3 = MathFunction.func1(100); //
        int total = result1 + result2 + result3;  //
        System.out.println(total);
    }
}
