/*Написать программу, которая будет определять, есть ли действительные корни у квадратного уравнение. Квадратное
уравнение можно записать следующим образом: ax^2+bx+c=0. Пользователь вводит параметры a, b и c. Если
дискриминант квадратного уравнения больше или равен 0, то уравнение имеет действительные корни, если дискриминант
меньше нуля, то уравнение не имеет корней.*/

import java.util.Scanner;

public class Zadacha7 {
    public Zadacha7() {
        System.out.println("Введите три значения переменных");
        int a = new Scanner(System.in).nextInt();
        int b = new Scanner(System.in).nextInt();
        int c = new Scanner(System.in).nextInt();

        double d = Math.pow(b, 2) - (4 * a * c);

        if (d < 0) {
            System.out.println("У уравнения нет действительных корней.");
            System.out.println("Дискриминант = " + d);

        } else if (d == 0) {
            System.out.println("У уравнения два равных корня");
            double koren = ((double) b / (2 * a));
            System.out.println("Дискриминант = " + d + " Корень = " + koren);
        } else if (d > 0) {
            System.out.println("У уравнения два различных корня");
            double koren = (b - Math.sqrt(d)) / (2 * a);
            double koren2 = (b + Math.sqrt(d)) / (2 * a);
            System.out.println("Дискриминант = " + d + " Корень 1 = " + koren + " Корень 2 = " + koren2);
        }

    }
}
