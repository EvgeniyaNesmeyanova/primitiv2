//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // Объявляете переменные для входных данных и
        // параметров программы: начального счёта,
        // суммы пополнения и тп
        int current = 100; //текущий счет
        int amount = 1100; //сумма пополнения
        int bonus;

        // Условным оператором проверяете, превысила ли
        // сумма пополнения порог, и для этих двух разных
        // сценариев рассчитываете сумму бонуса и выводите
        // на экран.
        if (amount > 1000) {
            bonus = amount / 100; //количество бонусов, при пополнении больше, чем на 1000 руб
        } else {
            bonus = 0; //количество бонусов при пополнении меньше, чем на 1000 руб или равно этой сумме
        }
        int current1 = current + amount + bonus; //сумма на текущем счету после зачисления пополнения
        System.out.println("На текущем счету " + current1 + " рублей");
        System.out.println("Вам в подарок было добавлено " + bonus+ " бонусных рублей");

    }
}