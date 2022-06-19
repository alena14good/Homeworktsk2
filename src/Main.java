public class Main {

    public static void main(String[] args) {

        int initial_account = 200; // Начальный счет
        int deposit_amount = 1200; // Сумма пополнения
        int bonus = 1;

        if (deposit_amount <= 1000) {
            bonus = 0;
        } else {
            bonus = deposit_amount / 100;
        }

        int sum = initial_account + deposit_amount + bonus;
        System.out.println("Бонус = " + bonus);
        System.out.println("Итоговый счет = " + sum);
        // Объявляете переменные для входных данных и
        // параметров программы: начального счёта,
        // суммы пополнения и тп

        // Условным оператором проверяете превысила ли
        // сумма пополнения порог и для этих двух разных
        // сценариев рассчитываете сумму бонуса и выводите
        // на экран.
    }
}

