import java.time.LocalDate;

public class Main {

    public static boolean isLeapYear(int y) {
        return (y % 4 == 0 && y % 100 != 0) || (y % 400 == 0);
    }

    public static String versionLink(int OS, int y){
        String txt;
        if (OS == 0) {
            if (y < 2015) {
                txt = "Установите облегченную версию приложения для iOS по ссылке";
            } else {
                txt = "Установите версию приложения для iOS по ссылке";
            }
        } else {
            if (y < 2015){
                txt = "Установите облегченную версию приложения для Android по ссылке";
            } else {
                txt = "Установите версию приложения для Android по ссылке";
            }
        }
        return txt;
    }

    public static int numberDay(int distance) {
        int day = 1;
        if (distance <= 20) {
            return day;
        } else if (distance <= 60) {
            return day += 1;
        } else {
            return day += 2;
        }
    }

    public static void main(String[] args) {
        System.out.println("task1");
        int year = 2021;
        if (isLeapYear(year)) {
            System.out.println(year + "год - високосный год");
        } else {
            System.out.println(year + "год - невисокосный год");
        }
        System.out.println();

        System.out.println("task2");
        int nameOS = 1;
        int currentYear = LocalDate.now().getYear();
        System.out.println(versionLink(nameOS, currentYear));
        System.out.println();

        System.out.println("task3");
        int deliveryDistance = 95;
        int deliveryDay = numberDay(deliveryDistance);
        if (deliveryDistance <= 100){
            System.out.println("Потребуется дней: " + deliveryDay);
        } else {
            System.out.println("Доставки нет");
        }
    }


}