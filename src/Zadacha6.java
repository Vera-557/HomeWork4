/*Нужно написать программу — помощника по кухне. Помощник должен определять, какое блюдо можно приготовить
из имеющихся продуктов. В программу сначала вводятся продукты. А далее нужно определить, возможно ли
из имеющихся продуктов приготовить яичницу, омлет или кофе. Для омлета требуется молоко и яйца, для
яичницы только яйца, для кофе — кофе и молоко.*/
import java.util.Scanner;
public class Zadacha6 {
    public Zadacha6(){
        System.out.println("Здравствуйте, я ваш персональный помощник на кухне!");
        System.out.println("Давайте что-нибудь приготовим, введите продукты, которые есть в наличии");
        System.out.println("Обычно в вашем холодильнике есть: мясо, рыба, молоко, масло, яйца, кофе, чай, овощи");

        String produkti = new Scanner(System.in).next().trim();

        switch (produkti){
            case ("мясо"):{
                System.out.println("Можно приготовить:");
                System.out.println("Гуляш, котлеты, запеченное в духовке мясо");
                System.out.println("У вас есть в наличии картошка?");
                char a = new Scanner(System.in).next().charAt(0);
                System.out.println("Д = да; Н = нет");
                char y = 'д';
                char n = 'н';
                if(a == y){System.out.println("Тогда можно сделать мясо по-французски");
                }else if (a == n){System.out.println("Тогда идём дальше");
                }else System.out.println("Ладно, можете не отвечать, идём дальше");break;}
            case("рыба"):{System.out.println("Можно приготовить:");
                System.out.println("Запеченную рыбу, жаренную рыбу, рыбный салат");break;}

            case("молоко"):{
                System.out.println("Можно сделать омлет или кашу"); break;}

            case("масло"):{
                System.out.println("Сделайте бутерброд");break;}

            case("яйца"):{System.out.println("Яичница");
                System.out.println("У вас есть молоко?");
                char a = new Scanner(System.in).next().charAt(0);
                System.out.println("Д = да; Н = нет");
                char y = 'д';
                char n = 'н';
                while (true){
                    if(a == y){System.out.println("Омлет");
                        break;
                    } else if (a == n) {System.out.println("Яичница");
                        break;
                    }else
                    a = new Scanner(System.in).next().charAt(0);}}
            case("кофе"):{System.out.println("Кофе без сахара");break;}
            case("чай"):{System.out.println("Чай");break;}
            case("овощи"):{System.out.println("Салат, свежие овощи, запечённые овощи");break;}
            default:{System.out.println("Я не знаю таких продуктов");}
        }

    }
}
