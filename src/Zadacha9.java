/*Заданы координаты двух фигур — пешки и слона. Определить, находится ли пешка под боем слона.
Слон ходит по диагонали, а пешка находится под боем, если стоит на одной диагонали со слоном.
Шахматное поле состоит из восьми клеток в ширину и в длину.*/

import java.util.Scanner;

public class Zadacha9 {
    public Zadacha9() {
        System.out.println("Введите координаты слона Y");
        char slonY = new Scanner(System.in).next().charAt(0);
        System.out.println("Введите координаты слона X");
        int slonX = new Scanner(System.in).nextInt();
        System.out.println("Введите координаты пешки Y");
        char peshkaY = new Scanner(System.in).next().charAt(0);
        System.out.println("Введите координаты слона X");
        int peshkaX = new Scanner(System.in).nextInt();

        int osY = Math.abs(slonY - peshkaY);
        int osX = Math.abs(slonX - peshkaX);

        if (osY == osX) {
            System.out.println("Пешка под боем");
        } else System.out.println("Пешка не под боем");

    }
}
