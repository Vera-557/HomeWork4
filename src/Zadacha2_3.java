import java.util.Scanner;

public class Zadacha2_3 {
    public Zadacha2_3() {
        System.out.println("Введите значение от 1 до 4");
        int nomerMesjaca = new Scanner(System.in).nextInt();
        switch (nomerMesjaca) {
            case (1): {
                System.out.println("Зима");
                break;
            }
            case (2): {
                System.out.println("Весна");
                break;
            }
            case (3): {
                System.out.println("Лето");
                break;
            }
            case (4): {
                System.out.println("Осень");
                break;
            }
            default: {
                System.out.println("Не верное значение");

            }
        }
    }

}
