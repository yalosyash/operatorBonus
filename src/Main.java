public class Main {
    public static void main(String[] args) {

        int balance = 100;
        int sum = 1100;

        System.out.println("Сумма пополнения: " + sum + " руб.");

        if (sum > 1000) {
            int bonus = sum / 100;
            balance += bonus + sum;

            System.out.println("Ваш бонус: " + bonus + " руб.");

        } else {
            balance += sum;
        }

        System.out.println("На балансе: " + balance + " руб.");
    }
}