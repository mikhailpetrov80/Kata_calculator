package org.example;

public class ReformerRoman {

    public static int value(char a) {
        switch (a) {
            case 'C':
                return 100;
            case 'L':
                return 50;
            case 'X':
                return 10;
            case 'V':
                return 5;
            case 'I':
                return 1;
            default:
                return 0;
        }
    }

    public static int reformerRoman(String number) {

        int result = 0;
        number = number.toUpperCase();

        for (int i = 0; i < number.length() - 1; i++) {
            if (value(number.charAt(i)) < value(number.charAt(i + 1))) {
                result -= value(number.charAt(i));
            } else {
                result += value(number.charAt(i));
            }
        }
        result += value(number.charAt(number.length() - 1));
        return result;
    }
}

