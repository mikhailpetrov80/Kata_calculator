package org.example;

public class ReformerArabic {

    enum Numeral {
        I(1), IV(4), V(5), IX(9), X(10), XL(40), L(50), XC(90), C(100);
        int weight;

        Numeral(int weight) {
            this.weight = weight;
        }
    }

    public static String roman(int n) {

        if (n <= 0) {
            try {
                throw new IllegalArgumentException();
            } catch (IllegalArgumentException e) {
                System.out.println("throws Exception //т.к. в римской системе нет отрицательных чисел");
            }
        }

        StringBuilder buf = new StringBuilder();

        final Numeral[] values = Numeral.values();
        for (int i = values.length - 1; i >= 0; i--) {
            while (n >= values[i].weight) {
                buf.append(values[i]);
                n -= values[i].weight;
            }
        }
        return buf.toString();
    }
}
