public class Main {
    public static void main(String[] args) {

        // Задача 1

        int clientOS = 0;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите версию приложения для IOS по ссылке");
        }

        // Задача 2
        int productionYear = 2015;
        int deviceYear = 2012;
        if (deviceYear < productionYear) {
            System.out.println("Установите облегченную версию приложения ");
        } else {
            System.out.println("Установите облегченную версию приложения ");
        }
        if (clientOS == 1) {
            System.out.println("для Android по ссылке ");
        } else {
            System.out.println("для IOS по ссылке ");
        }

        // Задача 3

        int year = 2021;
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + "год является високосным");
        } else {
            System.out.println(year + "год не является високосным");
        }

        // Задача 4

        int deliveryDistnce = 95;
        int deliveryDays = 1;
        int interval = 40;
        int startInterval = 20;
        if (deliveryDistnce <= startInterval) {
            deliveryDays = 1;
        } else {
            deliveryDays = deliveryDays + (int) Math.ceil((deliveryDistnce - startInterval) / (double) interval);
        }
        System.out.println("Потребуется дней: " + deliveryDays);

        // Задача 5
        int monthNumber = 12;
        switch (monthNumber) {
            case 1:
                System.out.println("Зима");
                break;
            case 2:
                System.out.println("Зима");
                break;
            case 3:
                System.out.println("Весна");
                break;
            case 4:
                System.out.println("Весна");
                break;
            case 5:
                System.out.println("Весна");
                break;
            case 6:
                System.out.println("Лето");
                break;
            case 7:
                System.out.println("Лето");
                break;
            case 8:
                System.out.println("Лето");
                break;
            case 9:
                System.out.println("Осень");
                break;
            case 10:
                System.out.println("Осень");
                break;
            case 11:
                System.out.println("Осенбь");
                break;
            case 12:
                System.out.println("Зима");
                break;
            default:
                System.out.println("Такого месяца нет");
        }
    }
}

