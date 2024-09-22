/*Определить, какое из трёх введённых пользователем значений
наименьшее, наибольшее, среднее. */

import java.util.Scanner;

public class Zadacha3 {
    public Zadacha3() {
        System.out.println("Введите три значения");
        int a = new Scanner(System.in).nextInt();
        int b = new Scanner(System.in).nextInt();
        int c = new Scanner(System.in).nextInt();
        int num = Math.max(c, Math.max(a, b));

        if (num == a) {
            System.out.println("Самое большое значение - " + a);
            int num1 = Math.max(c, b);
            if (num1 == b) {
                System.out.println("Среднее значение - " + b + " Минимальное значение - " + c);
            } else System.out.println("Среднее значение - " + c + " Минимальное значение - " + b);

        } else if (num == b) {
            System.out.println("Самое большое значение - " + b);
            int num1 = Math.max(c, a);
            if (num1 == a) {
                System.out.println("Среднее значение - " + a + " Минимальное значение - " + c);
            } else System.out.println("Среднее значение - " + c + " Минимальное значение - " + a);
        } else {
            System.out.println("Самое большое значение - " + c);
            int num1 = Math.max(b, a);
            if (num1 == a) {
                System.out.println("Среднее значение - " + a + " Минимальное значение - " + b);
            } else System.out.println("Среднее значение - " + b + " Минимальное значение - " + a);

        }
    }
}
