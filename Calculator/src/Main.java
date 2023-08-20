import java.io.IOException;
//import java.util.Objects;
import java.util.Scanner;
//import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Давай посчитаем?");
        Scanner in = new Scanner(System.in);
        String primer = in.nextLine();
        String [] a = primer.split(" ");
        for (String element: a) {
//        }
//        System.out.println();
//
//        if (a[0] == "I|II|III|IV|V|VI|VII|VIII|IX|X" ^ a[2] == "I|II|III|IV|V|VI|VII|VIII|IX|X"){

        }


        int b = Integer.parseInt (a[0]);
        int c = Integer.parseInt(a[2]);
        char[] e = a[1].toCharArray();

        if (b < 0 | b>10 | c<0 | c>10) {
        System.out.println("Вы ввели недопустимые числа");
        System. exit(0);
        }

        else
            switch (e[0]) {
                    case ('+'):
                        System.out.println(b + c);
                        break;

                    case ('-'):
                        System.out.println(b - c);
                        break;

                    case ('*'):
                        System.out.println(b * c);
                        break;

                    case ('/'):
                        System.out.println(b / c);
                        break;

                    default:
                        throw new IOException();
                }
            }
        }
