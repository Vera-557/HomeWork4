/*Вводятся два числа (большее и меньшее). Определить, кратно ли первое число второму, то есть делится ли первое
число нацело на второе. Вывести на экран сообщение об этом, а также остаток от деления, если первое число не
кратно второму.*/
import java.util.Scanner;
public class Zadacha4 {
    public Zadacha4(){
        System.out.println("Введите два числа");
        int a = new Scanner(System.in).nextInt();
        int b = new Scanner(System.in).nextInt();
        double num = a % b;
        if (num == 0){
            System.out.println(a + " кратно " + b);
        }else System.out.println("Остаток от деления = " + num);

    }
}
