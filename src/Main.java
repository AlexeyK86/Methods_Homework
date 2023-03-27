import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        checkIsLeapYear(2020);
        checkIsLeapYear(2022);
        checkIsLeapYear(2023);
        checkIsLeapYear(2024);
        checkIsLeapYear(2025);
        defineAppVersion( 1, 2023);
        PrintCardDeliveryDays ( 7);
        PrintCardDeliveryDays ( 95);
        PrintCardDeliveryDays ( 250);
    }

    public static void checkIsLeapYear(int year) {
            if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                System.out.println(year + " - високосный год");
            } else {
                System.out.println(year + " - не високосный год");
            }
        }

    public static void defineAppVersion(int mobileOs, int mobileYear) {
        String mobileOsName;

        switch (mobileOs) {
            case 0:
                mobileOsName = "Android";
                break;
            case 1:
                mobileOsName = "IOS";
                break;
            default:
                mobileOsName = "Неизвестная ОС";
        }

        int currentYear = LocalDate.now().getYear();

        if (mobileYear != currentYear) {
            System.out.println("Для ОС " + mobileOsName + " установите lite версию");
        } else {
            System.out.println("Для ОС " + mobileOsName + " установите обычную версию");
        }
    }

    public static int calcCardDeliveryDays(int distance) {
        int deliveryDays = -1;

        if (distance <= 20) {
            deliveryDays = 1;
        } else if (distance <= 60) {
            deliveryDays = 2;
        } else if (distance <= 100) {
            deliveryDays = 3;
        }
        return deliveryDays;
    }
    public static void PrintCardDeliveryDays(int distance) {
        int deliveryDays = calcCardDeliveryDays(distance);

        if (deliveryDays == -1) {
            System.out.println("Доставка не осуществляется");
        } else {
            System.out.println("Потребуется дней: " + deliveryDays);
        }
    }

    }




