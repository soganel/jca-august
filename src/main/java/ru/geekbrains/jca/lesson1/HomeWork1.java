package ru.geekbrains.jca.lesson1;

import java.util.Scanner;

public class HomeWork1 {

    public static void main(String[] args) { //Задание 1
        Scanner scanner = new Scanner (System.in);

        //region Задание 2
        System.out.println("Задание 2");
        byte bytevar = 21; // -128 to 127
        short shortvar = 12300; // -32768 to 32767
        int intvar = 55678; // -2147483648 to 2147483647
        long longvar = 2_000_000_000L; // -9223372036854775808 to 9223372036854775807
        float floatvar = 23.12f; //
        double doublevar = 778.819; //
        char charvar = '\u2242'; //
        boolean booleanvar = true; //
        System.out.println("byte = " + bytevar);
        System.out.println("short = " + shortvar);
        System.out.println("int = " + intvar);
        System.out.println("long = " + longvar);
        System.out.println("float = " + floatvar);
        System.out.println("double = " + doublevar);
        System.out.println("char = " + charvar);
        System.out.println("boolean = " + booleanvar);
        System.out.println("_____");
        //endregion

        //region Задание 3
        System.out.println("Задание 3");
        float res_z3 = primer3(10.5f, 13.6f, 45.25f, 5.125f);
        System.out.println("a*(b+(c/d)) = " + res_z3);
        System.out.println("_____");
        //endregion

        //region Задание 4
        System.out.println("Задание 4");
        System.out.println("Первое число:");
        int a1 = scanner.nextInt();
        System.out.println("Второе число:");
        int a2 = scanner.nextInt();
        boolean res_z4 = primer4(a1, a2);
        System.out.println(res_z4);
        System.out.println("_____");

        //endregion

        //region Задание 5
        System.out.println("Задание 5");
        System.out.println("Введите число:");
        int b1 = scanner.nextInt();
        primer5(b1);
        System.out.println("_____");

        //endregion

        //region Задание 6
        //Копия 5
        //endregion

        //region Задание 7
        System.out.println("Задание 7");
        System.out.println("Введите имя:");
        scanner.nextLine();
        String name1 = scanner.nextLine();
        hello(name1);
        System.out.println("_____");
        //endregion

        //region Задание 8
        System.out.println("Задание 8");
        System.out.println("Введите год:");
        int year1 = scanner.nextInt();
        v_year(year1);
        System.out.println("_____");
        //endregion
    }

    //region Задение 3 МЕТОД
    public static float primer3(float a, float b, float c, float d) {
        float res = a * (b + (c / d));
        System.out.println("a = " + a + ", b = " + b + ", c = " + c + ", d = " + d);
        return res; //return a * (b + (c / d))
    }
    //endregion

    //region Задание 4 МЕТОД
    public static boolean primer4(int a1, int a2) {
        boolean res = true;
        if (10 <= a1 + a2 && a1 +a2 <= 20) {
            return res;
        } else{
            return !res;
        }

    }
    //endregion

    //region Задание 5 МЕТОД
    public static void primer5(int b1) {   // public static void primer5(int b1) {return b1 < 0;} // true - отриц
        if (b1 >= 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }
    //endregion

    //region Задание 6 МЕТОД
    //Копия 5
    //endregion

    //region Задание 7 МЕТОД
    public static void hello(String name1) {
        System.out.println("Привет " + name1 + "!");
    }
    //endregion

    //region Задание 8 МЕТОД
    public static void v_year(int year1) { // return year1 % 100 == 0 && year1 % 400 == 0 || year1 % 4 == 0;
        if (year1 % 100 == 0) {
            if (year1 % 400 == 0) {
                System.out.println("Год " + year1 + " высокосный");
            } else {
                System.out.println("Год " + year1 + " не высокосный");
            }
        } else if (year1 % 4 == 0) {
            System.out.println("Год " + year1 + " высокосный");
        } else {
            System.out.println("Год " + year1 + " не высокосный");
        }
    }
    //endregion
}
