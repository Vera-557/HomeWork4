
import java.util.Scanner;

public class Zadacha2_2 {
    public Zadacha2_2() {
        System.out.println("Введите номер месяца года от 1 до 12");
        int nomerMesjaca = new Scanner(System.in).nextInt();
        while (true) {
            if (1 <= nomerMesjaca && nomerMesjaca <= 12) {
                if (3 <= nomerMesjaca && nomerMesjaca <= 5) {
                    System.out.println("Весна");
                    break;
                } else if (6 <= nomerMesjaca && nomerMesjaca <= 8) {
                    System.out.println("Лето");
                    break;
                } else if (9 <= nomerMesjaca && nomerMesjaca <= 11) {
                    System.out.println("Осень");
                    break;

                } else System.out.println("Зима");
                break;
            } else System.out.println("Попробуй ещё раз");
            nomerMesjaca = new Scanner(System.in).nextInt();
        }
    }

}
