public class M {
    public static void main(String[] args) {
        Object obj = 10;
        if (obj instanceof String) {
            System.out.println("Переменная obj является строкой");
        } else {
            System.out.println("Переменная obj не является строкой");
        }
    }
}
