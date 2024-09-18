import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("_______Задание №1_______");
        Scanner in = new Scanner(System.in);
        System.out.println("Какая у Вас OS? Введите соответствующее число (0 - iOS, 1 - Android):");
        byte clientOS = in.nextByte();
        if (clientOS == 1) {
            System.out.println("Установите версию приложения для  Android по ссылке: ");
        } else {
            System.out.println("Установите версию приложения для  iOS по ссылке: ");
        }
        System.out.println();

        System.out.println("_______Задание №2_______");

        System.out.println("Какая у Вас OS? Введите соответствующее число (0 - iOS, 1 - Android):");
        clientOS = in.nextByte();
        System.out.println("Какого года выпуска Ваш телефон?:");
        int clientDeviceYear = in.nextInt();
        if (clientOS == 1 && clientDeviceYear > 2015) {
            System.out.println("Установите версию приложения для Android по ссылке: ");
        } else if (clientOS == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке: ");
        } else if (clientOS == 0 && clientDeviceYear > 2015) {
            System.out.println("Установите версию приложения для  iOS по ссылке: ");
        } else {
            System.out.println("Установите облегченную версию приложения для  iOS по ссылке: ");
        }
        System.out.println();

        System.out.println("_______Задание №3_______");

        System.out.println("Введите год:");
        int year = in.nextInt();
        if (year > 1584 && year % 4 == 0 && year % 400 == 0) {
            System.out.println("Год високосный.");
        } else {
            System.out.println("Год невисокосный.");
        }
        System.out.println();

        System.out.println("_______Задание №4_______");

        System.out.println("Введите расстояние доставки:");
        byte distance = in.nextByte();
        byte timeOfDilivery = 0;
        if (0 <= distance && distance <= 20) {
            timeOfDilivery++;
            System.out.println("Потребуется дней:" + timeOfDilivery);
        } else if (20 < distance && distance <= 60) {
            timeOfDilivery += 2;
            System.out.println("Потребуется дней:" + timeOfDilivery);
        } else if (60 < distance && distance <= 100) {
            timeOfDilivery += 3;
            System.out.println("Потребуется дней:" + timeOfDilivery);
        } else {
            System.out.println("Доставка не предусмотрена");
        }
        System.out.println();

        System.out.println("_______Задание №5_______");

        System.out.println("Введите число месяца: ");
        byte monthNumber = in.nextByte();
        switch (monthNumber) {
            case 1, 2, 12:
                System.out.println("Зима");
                break;
            case 3, 4, 5:
                System.out.println("Весна");
                break;
            case 6, 7, 8:
                System.out.println("Лето");
                break;
            case 9, 10, 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Такого месяца не существует.");
                break;
        }

    }
}