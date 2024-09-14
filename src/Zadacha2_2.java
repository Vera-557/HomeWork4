
import java.util.Scanner;
public class Zadacha2_2 {
    public Zadacha2_2(){
        System.out.println("Введите номер месяца года от 1 до 12");
        int nomerMesjaca = new Scanner(System.in).nextInt();
        while (true){
            if (nomerMesjaca == 1 | nomerMesjaca == 2 | nomerMesjaca == 12 ){
                System.out.println("Зима");
                break;
            } else if (nomerMesjaca == 3 | nomerMesjaca == 4 | nomerMesjaca == 5 ){
                System.out.println("Весна");
                break;
            } else if (nomerMesjaca == 6 | nomerMesjaca == 7 | nomerMesjaca == 8 ){
                System.out.println("Лето");
                break;
            }else if (nomerMesjaca == 9 | nomerMesjaca == 10 | nomerMesjaca == 11 ){
                System.out.println("Осень");
                break;
            }else System.out.println("Попробуй ещё раз");
            nomerMesjaca = new Scanner(System.in).nextInt();
        }
    }

}
