/*Написать программу, которая в зависимости от выбора пользователя вычисляет площадь
одной из трёх геометрических фигур: прямоугольника, треугольника или круга. */
import java.util.Scanner;
public class Zadacha8 {
    public Zadacha8(){
        System.out.println("Выберите геометрическую фигуру для вычисления:");
        System.out.println("прямоугольника, треугольника или круга");
        String wibor = new Scanner(System.in).next().trim();

        switch (wibor){
            case "прямоугольник": System.out.println("Вычислим площадь прямоугольника");
                System.out.println("Введите дину разного размера сторон прямоугольника");
                int a = new Scanner(System.in).nextInt();
                int b = new Scanner(System.in).nextInt();
                int s = a * b;
                System.out.println("S = a * b; S = " + s);
                break;
            case "треугольник": System.out.println("Вычислим площадь треугольника");
                System.out.println("Введите дину основания и высоту");
                int q = new Scanner(System.in).nextInt();
                int h = new Scanner(System.in).nextInt();
                int w = (q * h) / 2;
                System.out.println("S = (a * h) / 2; S = " + w);
                break;
            case "круг": System.out.println("Вычислим площадь круга");
                System.out.println("Введите дину радиуса");
                int r = new Scanner(System.in).nextInt();
                double o = Math.pow(r, 2) * Math.PI;
                System.out.println("S = r *2 * Pi; S = " + o);
                break;
        }
    }
}
