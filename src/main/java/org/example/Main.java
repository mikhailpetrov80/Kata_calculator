package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) throws Exception {

        String[] arabic = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
        String[] roman = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
        String[] operations = {"+", "-", "*", "/"};
        int x = 0;
        int y = 0;
        String operation;

        System.out.println("Введите арифметическую операцию(+, -, *, /) из двух чисел в " +
                "римском или арабском формате через пробел от 0 до 10: ");

        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String[] arrStr = str.split(" ");

        if (arrStr.length < 3) {
            try {
                throw new Exception();
            } catch (Exception e) {
                System.out.println("throws Exception //т.к. строка не является математической операцией");
            }
        } else if (arrStr.length > 3) {
            try {
                throw new Exception();
            } catch (Exception e) {
                System.out.println("throws Exception //т.к. формат математической операции не " +
                        "удовлетворяет заданию - два операнда и один оператор (+, -, /, *)");
            }
        } else {
            String strX = arrStr[0];
            String strY = arrStr[2];
            operation = arrStr[1];
            if (Arrays.asList(arabic).contains(strX) && Arrays.asList(arabic).contains(strY)) {
                x = Integer.parseInt(strX);
                y = Integer.parseInt(strY);
                System.out.println(Calc.calc(x, y, operation));
            } else if (Arrays.asList(roman).contains(strX) && Arrays.asList(roman).contains(strY)) {
                x = ReformerRoman.reformerRoman(strX);
                y = ReformerRoman.reformerRoman(strY);
                System.out.println(ReformerArabic.roman(Calc.calc(x, y, operation)));
            } else {
                System.out.println("throws Exception //т.к. используются одновременно разные системы счисления");
            }
        }
    }
}