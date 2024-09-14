//Напишите по этой блок-схеме программу, если x = 6, а затем x = -2
import java.util.Scanner;

public class Zadacha1 {
    public Zadacha1(){
        System.out.println("Введите значение Х");
        int x = new Scanner(System.in).nextInt();
        if(x == 6){
            int y = 2 * x;
            System.out.println("Результат = " + y);
        } else System.out.println("Результат = " + ( - 2 * x));
    }

}
