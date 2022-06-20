public class Main {

    public static void main(String[] args) {

        int initialAccount = 100; // Начальный счет
        int depositAmount = 1100; // Сумма пополнения
        int bonus = 1;

        if (depositAmount <= 1000) {
            bonus = 0;
        } else {
            bonus = depositAmount / 100;
        }

        int sum = initialAccount + depositAmount + bonus;
        System.out.println("Бонус = " + bonus);
        System.out.println("Итоговый счет = " + sum);

    }
}

