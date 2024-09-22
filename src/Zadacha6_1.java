import java.util.Scanner;
//
public class Zadacha6_1 {
    public Zadacha6_1() {
        System.out.println("Здравствуйте, я ваш персональный помощник на кухне!");
        System.out.println("Давайте что-нибудь приготовим, введите продукты, через запятую, которые есть в наличии");
        System.out.println("Обычно в вашем холодильнике есть: мясо, молоко, масло, яйца, кофе, чай, овощи");

        String produkti = new Scanner(System.in).nextLine();
        label:
        while (true) {
            switch (produkti) {
                case "мясо, овощи":
                    System.out.println("Мясо с овощами, мясо по-французски, котлеты");
                    break label;
                case "молоко, яйца, чай":
                    System.out.println("Омлет, чай с молоком, чай, яичница");
                    break label;
                case "Мясо":
                    System.out.println("Запечь, сварить, поджарить");
                    break label;
                case "молоко":
                    System.out.println("Каша");
                    break label;
                case "яйца":
                    System.out.println("яичница");
                    break label;
                case "чай":
                    System.out.println("Добавь кипяток и выпей чай");
                    break label;
                case "яйца, чай":
                    System.out.println("чай, яичница");
                    break label;
                case "молоко, яйца, кофе":
                    System.out.println("Омлет, кофе с молоком, кофе, яичница");
                    break label;
                case "молоко, яйца":
                    System.out.println("Омлет, яичница");
                    break label;
                case "молоко, чай, кофе":
                    System.out.println("чай с молоком, чай, кофе, кофе с молоком");
                    break label;
                case "овощи":
                    System.out.println("Овощи Запечь, сварить, поджарить");
                    break label;
                default:
                    System.out.println("Я не знаю других рецептов, попробуй ещё раз");
                    break;
            }
            produkti = new Scanner(System.in).nextLine();

        }
    }
}
