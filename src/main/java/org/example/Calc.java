package org.example;

public class Calc {

    public static int calc(int x, int y, String operation) {
        int res = 0;
        switch (operation) {
            case "*":
                res = x * y;
                break;
            case "/":
                res = x / y;
                break;
            case "+":
                res = x + y;
                break;
            case "-":
                res = x - y;
                break;
        }
        return res;
    }
}
