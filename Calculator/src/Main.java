import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Давай посчитаем?");
        Scanner in = new Scanner(System.in);
        String primer = in.nextLine();
        String [] a = primer.split(" ");

//        Object obj = a[0];
//        Object obj2 = a[2];
//        if (obj instanceof String || obj2 instanceof String) {
//            System.out.println("Переменная obj является строкой");
//        } else {
//            System.out.println("Переменная obj не является строкой");
//        }
//        System.out.println(a[0] + a[2]);

//        if (a[0] == int || a[2] == int) {
//            break;
//        }


        char z = ""


        if (obj == "I|II|III|IV|V|VI|VII|VIII|IX|X" ^ obj2 == "|II|III|IV|V|VI|VII|VIII|IX|X");
        else {
            System.out.println("No Rome");
        }
//
//        }


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

