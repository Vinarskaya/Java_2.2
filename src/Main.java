public class Main {
    public static void main(String[] args) {

        int balance = 500;
        int refill = 1300;
        int bonus = 100;

        if (refill > 1000) {
            System.out.println("Итоговый счёт: " + (balance + refill + refill / bonus) + " руб");
            System.out.println("Количество бонусных рублей: " + (refill / bonus) + " руб");
        } else {
            System.out.println("Итоговый счёт: " + (balance + refill) + " руб");
            System.out.println("Количество бонусных рублей: 0 руб");
        }

    }
}
