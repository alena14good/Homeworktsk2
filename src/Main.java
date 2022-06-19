public class Main {

    public static void main(String[] args) {

        int initial_account = 100; // Начальный счет
        int deposit_amount = 1100; // Сумма пополнения
        int bonus = 1;

        if (deposit_amount <= 1000) {
            bonus = 0;
        } else {
            bonus = deposit_amount / 100;
        }

        int sum = initial_account + deposit_amount + bonus;
        System.out.println("Бонус = " + bonus);
        System.out.println("Итоговый счет = " + sum);

    }
}

