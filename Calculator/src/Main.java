import java.util.Objects;
import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Давай посчитаем?");
        String primer; //создать строку
        Scanner in = new Scanner(System.in); //Вызвать сканер
        primer = in.nextLine(); //записать пример в primer
        //System.out.println(primer); //показать то что введено
        String [] a = primer.split(" "); //разделить на массивы через пробел
        for (String element: a) {
        //    System.out.print(element); //вывести элеиенты с новой строки каждый
        }
        System.out.println();
        int b = Integer.parseInt (a[0]); //Привести к инт
        int c = Integer.parseInt(a[2]);  //Привести к инт
        char[] e = a[1].toCharArray();   //привести к чар
        //System.out.println(e);

        switch (e[0]){
            case ('+'):
                System.out.println(b+c);
                break;

            case ('-'):
                System.out.println(b-c);
                break;

            case ('*'):
                System.out.println(b*c);
                break;

            case ('/'):
                System.out.println(b/c);
                break;

            default:
                System.out.println("NEPRAVILNO");
                break;

//        while (Objects.equals(a[1], "+")) {
//            System.out.println(b+c);
//            break;


        }

     }
    }

