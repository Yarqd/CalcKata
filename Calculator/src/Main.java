import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static int main(String[] args) throws IOException, NullPointerException {
        System.out.println("Давай посчитаем?");
        Scanner in = new Scanner(System.in);
        String primer = in.nextLine();
        String[] a = primer.split(" ");

        int b;
        int c;
        boolean isRomain;
        char[] e = a[1].toCharArray();
        try {
            b = Integer.parseInt(a[0]);
            c = Integer.parseInt(a[2]);

        } catch (NullPointerException e1) {
            System.out.println("Вы ввели неправильный знак");
        }

        if (b < 0 | b > 10 | c < 0 | c > 10) {
            System.out.println("Вы ввели недопустимые числа");
            System.exit(0);
        } else
            switch (e[0]) {
                case ('+') -> System.out.println(b + c);
                case ('-') -> System.out.println(b - c);
                case ('*') -> System.out.println(b * c);
                case ('/') -> System.out.println(b / c);
                default -> throw new IOException();
            }
    }

    private static int romanToNumber (String roman) throws InputMismatchException {
        try {
            if (roman.equals("I")) {
                return 1;
            } else if (roman.equals("II")) {
                return 2;
            } else if (roman.equals("III")) {
                return 3;
            } else if (roman.equals("IV")) {
                return 4;
            } else if (roman.equals("V")) {
                return 5;
            } else if (roman.equals("VI")) {
                return 6;
            } else if (roman.equals("VII")) {
                return 7;
            } else if (roman.equals("VIII")) {
                return 8;
            } else if (roman.equals("IX")) {
                return 9;
            } else if (roman.equals("X")) {
                return 10;
            }
        } catch (InputMismatchException e) {
            throw new InputMismatchException("Неверный формат данных");
        }
        return -1;
    }

    private static String convertNumToRoman (int arab) {
        String[] roman = {"O", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X", "XI", "XII", "XIII", "XIV", "XV", "XVI", "XVII", "XVIII", "XIX", "XX",
                "XXI", "XXII", "XXIII", "XXIV", "XXV", "XXVI", "XXVII", "XXVIII", "XXIX", "XXX", "XXXI", "XXXII", "XXXIII", "XXXIV", "XXXV", "XXXVI", "XXXVII", "XXXVIII", "XXXIX", "XL",
                "XLI", "XLII", "XLIII", "XLIV", "XLV", "XLVI", "XLVII", "XLVIII", "XLIX", "L", "LI", "LII", "LIII", "LIV", "LV", "LVI", "LVII", "LVIII", "LIX", "LX",
                "LXI", "LXII", "LXIII", "LXIV", "LXV", "LXVI", "LXVII", "LXVIII", "LXIX", "LXX",
                "LXXI", "LXXII", "LXXIII", "LXXIV", "LXXV", "LXXVI", "LXXVII", "LXXVIII", "LXXIX", "LXXX",
                "LXXXI", "LXXXII", "LXXXIII", "LXXXIV", "LXXXV", "LXXXVI", "LXXXVII", "LXXXVIII", "LXXXIX", "XC",
                "XCI", "XCII", "XCIII", "XCIV", "XCV", "XCVI", "XCVII", "XCVIII", "XCIX", "C"
        };
        final String s = roman[arab];
        return s;
}