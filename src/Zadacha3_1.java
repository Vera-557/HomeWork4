import java.util.Scanner;

public class Zadacha3_1 {
    public Zadacha3_1() {
        System.out.println("Введите три значения");
        int a = new Scanner(System.in).nextInt();
        int b = new Scanner(System.in).nextInt();
        int c = new Scanner(System.in).nextInt();
        int num = Math.max(c, Math.max(a, b));

        if ((a == b) && (b == c)) {
            System.out.println("Вы ввели два одинаковых числа");
        } else if ((a == b || a == c || b == c)) {
            System.out.println("Вы ввели три одинаковых числа");

        } else if (num == a) {
            int num1 = Math.max(b, c);
            System.out.print("Самое большое число = " + a);
            if (num1 == b) {
                System.out.println("Среднее число = " + b + " Самое маленькое число " + c);
            } else System.out.println("Среднее число = " + c + " Самое маленькое число " + b);
        } else if (num == b) {
            int num1 = Math.max(a, c);
            System.out.println("Самое большое число = " + b);
            if (num1 == a) {
                System.out.println("Среднее число = " + a + " Самое маленькое число " + c);
            } else System.out.println("Среднее число = " + c + " Самое маленькое число " + a);
        } else {
            int num1 = Math.max(a, b);
            System.out.println("Самое большое число = " + c);
            if (num1 == a) {
                System.out.println("Среднее число = " + a + " Самое маленькое число " + b);
            } else System.out.println("Среднее число = " + b + " Самое маленькое число " + a);
        }


    }
}
