/*Вводится значение от 1 до 4. Вывести на консоль: Зима, если введено 1,
Весна — 2, Лето — 3, Осень — 4*/

import java.util.Scanner;

public class Zadacha2 {
    public Zadacha2() {
        System.out.println("Введите номер месяца года");
        int nomerMesjaca = new Scanner(System.in).nextInt();
        switch (nomerMesjaca) {
            case (12):
            case (1):
            case (2): {
                System.out.println("Зима");
                break;
            }
            case (3):
            case (4):
            case (5): {
                System.out.println("Весна");
                break;
            }
            case (6):
            case (7):
            case (8): {
                System.out.println("Лето");
                break;
            }
            case (9):
            case (10):
            case (11): {
                System.out.println("Осень");
                break;
            }
            default: {
                System.out.println("Такого месяца года нет");

            }

        }


    }
}
