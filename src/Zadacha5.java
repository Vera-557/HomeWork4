/*Заданы длины сторон треугольника. Необходимо определить, может ли существовать треугольник с такими сторонами. */

import java.util.Scanner;

public class Zadacha5 {
    public Zadacha5() {
        System.out.println("Введите три стороны треугольника");
        float a = new Scanner(System.in).nextFloat();
        float b = new Scanner(System.in).nextFloat();
        float c = new Scanner(System.in).nextFloat();

        if ((a + b) < c) {
            System.out.println("Неверные параметры!");
        } else if ((a + c) < b) {
            System.out.println("Неверные параметры!");
        } else if ((b + c) < a) {
            System.out.println("Неверные параметры!");
        } else System.out.println("Возможно построение треугольника" + a + b + c);
    }

}
